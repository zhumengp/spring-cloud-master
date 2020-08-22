package org.com.zhump.mssp.service;

import org.apache.ibatis.annotations.Param;
import org.com.zhump.mssp.entity.MsspSystem;
import org.com.zhump.mssp.entity.MsspSystemExample;

import java.util.List;

public interface IMsspSystemService {

    int countByExample(MsspSystemExample example);
    int deleteByExample(MsspSystemExample example);
    int insertSelective(MsspSystem record);
    List<MsspSystem> selectByExample(MsspSystemExample example);
    MsspSystem selectByPrimaryKey(Integer id);
    int updateByExampleSelective(@Param("record") MsspSystem record, @Param("example") MsspSystemExample example);
}
