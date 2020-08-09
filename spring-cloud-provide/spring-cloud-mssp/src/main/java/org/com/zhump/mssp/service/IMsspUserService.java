package org.com.zhump.mssp.service;

import org.apache.ibatis.annotations.Param;
import org.com.zhump.mssp.entity.MsspUser;
import org.com.zhump.mssp.entity.MsspUserExample;
import org.com.zhump.mssp.web.dto.MsspUserDTO;
import org.omg.CORBA.PUBLIC_MEMBER;

import java.util.List;

public interface IMsspUserService {


    int countByExample(MsspUserExample example);
    int deleteByExample(MsspUserExample example);
    int deleteByPrimaryKey(Long id);
    int insertSelective(MsspUser record);
    List<MsspUser> selectByExample(MsspUserExample example);
    MsspUser selectByPrimaryKey(Long id);
    int updateByExampleSelective(@Param("record") MsspUser record, @Param("example") MsspUserExample example);
    int updateByPrimaryKeySelective(MsspUser record);



}
