package org.com.zhump.mssp.service.impl;

import org.com.zhump.mssp.dao.MsspRoleMapper;
import org.com.zhump.mssp.entity.*;
import org.com.zhump.mssp.service.*;
import org.com.zhump.mssp.web.vo.MenusTreeVO;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.ArrayList;
import java.util.List;

@Service
public class MsspRoleServiceImpl implements IMsspRoleService {

    @Resource
    MsspRoleMapper msspRoleMapper;

    @Resource
    IMsspRolePermissionService msspRolePermissionService;
    @Resource
    IMsspSystemService msspSystemService;
    @Resource
    IMsspPermissionService msspPermissionService;


    @Override
    public int countByExample(MsspRoleExample example) {
        return msspRoleMapper.countByExample(example);
    }

    @Override
    public int deleteByExample(MsspRoleExample example) {
        return msspRoleMapper.deleteByExample(example);
    }

    @Override
    public int deleteByPrimaryKey(Long id) {
        return msspRoleMapper.deleteByPrimaryKey(id);
    }

    @Override
    public int insertSelective(MsspRole record) {
        return msspRoleMapper.insertSelective(record);
    }

    @Override
    public List<MsspRole> selectByExample(MsspRoleExample example) {
        return msspRoleMapper.selectByExample(example);
    }

    @Override
    public MsspRole selectByPrimaryKey(Long id) {
        return msspRoleMapper.selectByPrimaryKey(id);
    }

    @Override
    public int updateByExampleSelective(MsspRole record, MsspRoleExample example) {
        return msspRoleMapper.updateByExampleSelective(record,example);
    }

    @Override
    public int updateByPrimaryKeySelective(MsspRole record) {
        return msspRoleMapper.updateByPrimaryKeySelective(record);
    }

    @Override
    public List<MenusTreeVO> menus(Long roleId) {

        //通过roleID 查询所有的权限
        MsspRolePermissionExample example = new MsspRolePermissionExample();
        example.createCriteria().andRoleIdEqualTo(roleId);
        List<MsspRolePermission> msspRolePermissions = msspRolePermissionService.selectActive(example);
        //查询可用系统
        MsspSystemExample systemExample = new MsspSystemExample();
        systemExample.createCriteria().andStatusEqualTo(1);
        List<MsspSystem> msspSystems = msspSystemService.selectByExample(systemExample);
        List<MenusTreeVO> systems = new ArrayList<>();
        if (msspSystems == null || msspSystems.size() <= 0){
            return systems;
        }
        //组装系统集合
        msspSystems.stream().forEach(system ->{
            MenusTreeVO menusTreeVO = new MenusTreeVO();
            menusTreeVO.setId(system.getId());
            menusTreeVO.setLabel(system.getName());
            menusTreeVO.setPid(0L);
            menusTreeVO.setUrl("");
            menusTreeVO.setChecked(true);
            systems.add(menusTreeVO);
        });
        //组装具体权限菜单
        for (MenusTreeVO system : systems){
            //通过系统ID去获取有哪些资源
            MsspPermissionExample permissionExample = new MsspPermissionExample();
            permissionExample.createCriteria().andStatusEqualTo(1);
            permissionExample.createCriteria().andSystemIdEqualTo(system.getId());
            List<MsspPermission> msspPermissions = msspPermissionService.selectByExample(permissionExample);
            if (msspPermissions == null || msspPermissions.size() <= 0){
                continue;
            }
            List<MenusTreeVO> folders = new ArrayList<>();
            for (MsspPermission msspPermission : msspPermissions){
                if (msspPermission.getPid().longValue() != 0 || msspPermission.getType().intValue() != 1){
                    continue;
                }
                MenusTreeVO folder = new MenusTreeVO();
                folder.setPid(msspPermission.getPid());
                folder.setId(msspPermission.getId());
                folder.setLabel(msspPermission.getName());
                folder.setUrl(msspPermission.getUri());
                for (MsspRolePermission msspRolePermission : msspRolePermissions){
                    if (msspPermission.getId().longValue() == msspRolePermission.getPermissionId()){
                        folder.setChecked(true);
                    }
                }
                folders.add(folder);
            }
            for (MenusTreeVO menu : folders) {
                menu.setChildren(getChildren(menu.getId(), msspPermissions,msspRolePermissions));
            }
            system.setChildren(folders);
        }
        return systems;
    }
    /**递归子*/
    private List<MenusTreeVO> getChildren(Long id, List<MsspPermission> msspPermissions, List<MsspRolePermission> msspRolePermissions) {
        List<MenusTreeVO> childList = new ArrayList<MenusTreeVO>();
        for (MsspPermission msspPermission : msspPermissions) {
            if (msspPermission.getPid() == null || msspPermission.getPid().longValue() == 0) {
             continue;
            }
            if (msspPermission.getPid().equals(id)) {
                MenusTreeVO resourcesTreeVO = new MenusTreeVO();
                resourcesTreeVO.setId(msspPermission.getId());
                resourcesTreeVO.setLabel(msspPermission.getName());
                resourcesTreeVO.setUrl(msspPermission.getUri());
                resourcesTreeVO.setPid(msspPermission.getPid());
                for (MsspRolePermission msspRolePermission : msspRolePermissions){
                    if (msspPermission.getId() == msspRolePermission.getPermissionId()){
                        resourcesTreeVO.setChecked(true);
                    }
                }
                childList.add(resourcesTreeVO);
            }
        }
        for (MenusTreeVO menu : childList) {
            menu.setChildren(getChildren(menu.getId(), msspPermissions,msspRolePermissions));
        }
        if (childList.size() == 0) {
            return new ArrayList<MenusTreeVO>();
        }
        return childList;
    }
}
