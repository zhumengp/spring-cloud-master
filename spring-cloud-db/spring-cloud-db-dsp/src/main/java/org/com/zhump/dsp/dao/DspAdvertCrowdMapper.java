package org.com.zhump.dsp.dao;

import org.com.zhump.dsp.entity.DspAdvertCrowd;
import org.com.zhump.dsp.entity.DspAdvertCrowdExample;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface DspAdvertCrowdMapper {
    int countByExample(DspAdvertCrowdExample example);

    int deleteByExample(DspAdvertCrowdExample example);

    int deleteByPrimaryKey(Long id);

    int insert(DspAdvertCrowd record);

    int insertSelective(DspAdvertCrowd record);

    List<DspAdvertCrowd> selectByExample(DspAdvertCrowdExample example);

    DspAdvertCrowd selectByPrimaryKey(Long id);

    int updateByExampleSelective(@Param("record") DspAdvertCrowd record, @Param("example") DspAdvertCrowdExample example);

    int updateByExample(@Param("record") DspAdvertCrowd record, @Param("example") DspAdvertCrowdExample example);

    int updateByPrimaryKeySelective(DspAdvertCrowd record);

    int updateByPrimaryKey(DspAdvertCrowd record);
}