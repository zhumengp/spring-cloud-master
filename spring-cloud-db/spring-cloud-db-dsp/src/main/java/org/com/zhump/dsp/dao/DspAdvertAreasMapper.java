package org.com.zhump.dsp.dao;

import org.com.zhump.dsp.entity.DspAdvertAreas;
import org.com.zhump.dsp.entity.DspAdvertAreasExample;
import org.apache.ibatis.annotations.Param;

import java.util.List;
import java.util.Map;

public interface DspAdvertAreasMapper {
    int countByExample(DspAdvertAreasExample example);

    int deleteByExample(DspAdvertAreasExample example);

    int deleteByPrimaryKey(Integer id);

    int insertSelective(DspAdvertAreas record);

    List<DspAdvertAreas> selectByExample(DspAdvertAreasExample example);

    DspAdvertAreas selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") DspAdvertAreas record, @Param("example") DspAdvertAreasExample example);

    int updateByPrimaryKeySelective(DspAdvertAreas record);

    Integer insertBatch(Map<String, Object> map);
}