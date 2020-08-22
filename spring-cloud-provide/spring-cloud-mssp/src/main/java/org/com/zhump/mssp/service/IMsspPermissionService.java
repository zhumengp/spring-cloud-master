package org.com.zhump.mssp.service;

import org.apache.ibatis.annotations.Param;
import org.com.zhump.mssp.entity.MsspPermission;
import org.com.zhump.mssp.entity.MsspPermissionExample;

import java.util.List;

public interface IMsspPermissionService {




    int deleteByExample(MsspPermissionExample example);

    int insertSelective(MsspPermission record);

    List<MsspPermission> selectByExample(MsspPermissionExample example);

    MsspPermission selectByPrimaryKey(Long id);

    int updateByExampleSelective(@Param("record") MsspPermission record, @Param("example") MsspPermissionExample example);
}
