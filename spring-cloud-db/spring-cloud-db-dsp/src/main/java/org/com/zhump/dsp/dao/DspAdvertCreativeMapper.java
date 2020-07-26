package org.com.zhump.dsp.dao;

import org.com.zhump.dsp.entity.DspAdvertCreative;
import org.com.zhump.dsp.entity.DspAdvertCreativeExample;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface DspAdvertCreativeMapper {
    int countByExample(DspAdvertCreativeExample example);

    int deleteByExample(DspAdvertCreativeExample example);

    int deleteByPrimaryKey(Long id);

    int insertSelective(DspAdvertCreative record);

    List<DspAdvertCreative> selectByExampleWithBLOBs(DspAdvertCreativeExample example);

    List<DspAdvertCreative> selectByExample(DspAdvertCreativeExample example);

    DspAdvertCreative selectByPrimaryKey(Long id);

    int updateByExampleSelective(@Param("record") DspAdvertCreative record, @Param("example") DspAdvertCreativeExample example);

    int updateByPrimaryKeySelective(DspAdvertCreative record);

}