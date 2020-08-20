package org.com.zhump.mssp.web.controller;

import com.baidu.unbiz.fluentvalidator.ComplexResult;
import com.baidu.unbiz.fluentvalidator.FluentValidator;
import com.baidu.unbiz.fluentvalidator.ResultCollectors;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiImplicitParam;
import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiParam;
import lombok.extern.log4j.Log4j2;
import org.com.zhump.enums.ErrorEnum;
import org.com.zhump.mssp.entity.MsspRole;
import org.com.zhump.mssp.entity.MsspRoleExample;
import org.com.zhump.mssp.entity.MsspUser;
import org.com.zhump.mssp.entity.MsspUserExample;
import org.com.zhump.mssp.service.IMsspRoleService;
import org.com.zhump.mssp.service.IMsspUserService;
import org.com.zhump.mssp.web.dto.MsspRoleAddDTO;
import org.com.zhump.mssp.web.dto.MsspRoleEditDTO;
import org.com.zhump.mssp.web.dto.MsspUserAddDTO;
import org.com.zhump.mssp.web.dto.MsspUserEditDTO;
import org.com.zhump.result.BaseResult;
import org.com.zhump.result.Result;
import org.com.zhump.validator.NotNullValidator;
import org.springframework.beans.BeanUtils;
import org.springframework.http.MediaType;
import org.springframework.util.DigestUtils;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;
import java.util.List;

@RestController
@Log4j2
@RequestMapping(value = "/role")
@Api(value = "MSSP - MsspRoleController",tags = {"角色管理模块"},produces = MediaType.APPLICATION_JSON_UTF8_VALUE)
public class MsspRoleController {


    @Resource
    private IMsspRoleService msspRoleService;


    /**
     *根据用户Id 查询用户信息
     * @param roleId
     * @return
     */
    @RequestMapping(value = "/getByRoleId/{roleId}",method = RequestMethod.GET)
    @ApiOperation(httpMethod = "GET",value = "根据角色ID查询详情")
    @ApiImplicitParam(name = "roleId",value = "角色ID")
    public BaseResult getByUserId(@PathVariable(value = "roleId") Long roleId){
        log.info("查询角色数据ID：{}",roleId);
        MsspRole role = msspRoleService.selectByPrimaryKey(roleId);
        return Result.ok(role);
    }

    /**
     * 新增用户信息
     * @param msspRoleAddDto 新增参数
     * @return
     */
    @RequestMapping(value = "/insert",method = RequestMethod.POST)
    @ApiOperation(httpMethod = "POST",value = "新增角色")
    public BaseResult insert(@ApiParam(name = "msspRoleAddDto", value = "新增角色Dto")@RequestBody MsspRoleAddDTO msspRoleAddDto){
        ComplexResult re = FluentValidator.checkAll()
                .on(msspRoleAddDto.getName(),new NotNullValidator("角色名"))
                .on(msspRoleAddDto.getRemark(),new NotNullValidator("角色描述"))
                .doValidate()
                .result(ResultCollectors.toComplex());
        if (!re.isSuccess()){
            return Result.wrap(ErrorEnum.DSP10000002.getCode(),ErrorEnum.DSP10000002.getMsg(),re.getErrors());
        }
        //查询账号是否相同
        MsspRoleExample example = new MsspRoleExample();
        example.createCriteria().andNameEqualTo(msspRoleAddDto.getName());
        List<MsspRole> msspRoles = msspRoleService.selectByExample(example);
        if (msspRoles != null && msspRoles.size() > 0){
            return Result.wrap(ErrorEnum.MSSP10000002.getCode(),"账户名相同");
        }
        MsspRole recod = new MsspRole();
        BeanUtils.copyProperties(msspRoleAddDto,recod);
        int result = msspRoleService.insertSelective(recod);
        if (result > 0){
            return Result.ok();
        }
        return Result.error();
    }

    /**
     * 删除用户
     * @param roleId 用户ID
     */
    @RequestMapping(value = "/delete/{roleId}",method = RequestMethod.DELETE)
    @ApiOperation(httpMethod = "DELETE",value = "删除角色")
    @ApiImplicitParam(name = "roleId",value = "角色ID")
    public BaseResult delete( @PathVariable(value = "roleId") Long roleId){
        log.info("删除用户数据ID：{}",roleId);
        int delete = msspRoleService.deleteByPrimaryKey(roleId);
        if (delete > 0){
            return Result.ok();
        }
        return Result.error();
    }

    /**
     * 查询用户信息
     * @return
     */
    @RequestMapping(value = "/list",method = RequestMethod.GET)
    @ApiOperation(httpMethod = "GET",value = "获取用户信息")
    public BaseResult list(){
        MsspRoleExample example = new MsspRoleExample();
        List<MsspRole> msspRoles = msspRoleService.selectByExample(example);
        return Result.ok(msspRoles);
    }

    /**
     * 编辑用户
     */

    @RequestMapping(value = "/edit",method = RequestMethod.POST)
    @ApiOperation(httpMethod = "POST",value = "编辑用户信息")
    @ApiParam(name = "msspRoleEditDto", value = "编辑角色Dto")
    public BaseResult edit(@RequestBody MsspRoleEditDTO msspRoleEditDto){
        if (msspRoleEditDto.getRoleId() == null){
            throw new IllegalArgumentException("ID不能为空");
        }
        ComplexResult re = FluentValidator.checkAll()
                .on(msspRoleEditDto.getName(),new NotNullValidator("角色名"))
                .on(msspRoleEditDto.getRemark(),new NotNullValidator("角色描述"))
                .doValidate()
                .result(ResultCollectors.toComplex());
        if (!re.isSuccess()){
            return Result.wrap(ErrorEnum.DSP10000002.getCode(),ErrorEnum.DSP10000002.getMsg(),re.getErrors());
        }
        MsspRole role = new MsspRole();
        BeanUtils.copyProperties(msspRoleEditDto,role);
        role.setId(msspRoleEditDto.getRoleId());
        int i = msspRoleService.updateByPrimaryKeySelective(role);
        if (i > 0){
            return Result.ok();
        }
        return Result.wrap(ErrorEnum.MSSP10000002.getCode(),ErrorEnum.MSSP10000002.getMsg());
    }

}
