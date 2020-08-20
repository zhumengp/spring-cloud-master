package org.com.zhump.mssp.service;

import org.apache.ibatis.annotations.Param;
import org.com.zhump.mssp.entity.MsspRole;
import org.com.zhump.mssp.entity.MsspRoleExample;
import org.com.zhump.mssp.entity.MsspUser;
import org.com.zhump.mssp.entity.MsspUserExample;

import java.util.List;

public interface IMsspRoleService {


    int countByExample(MsspRoleExample example);
    int deleteByExample(MsspRoleExample example);
    int deleteByPrimaryKey(Long id);
    int insertSelective(MsspRole record);
    List<MsspRole> selectByExample(MsspRoleExample example);
    MsspRole selectByPrimaryKey(Long id);
    int updateByExampleSelective(@Param("record") MsspRole record, @Param("example") MsspRoleExample example);
    int updateByPrimaryKeySelective(MsspRole record);



}
