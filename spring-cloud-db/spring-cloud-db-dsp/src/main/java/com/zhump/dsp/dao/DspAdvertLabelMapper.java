package com.zhump.dsp.dao;

import com.zhump.dsp.entity.DspAdvertLabel;
import com.zhump.dsp.entity.DspAdvertLabelExample;
import org.apache.ibatis.annotations.Param;

import java.util.List;
import java.util.Map;

public interface DspAdvertLabelMapper {
    int countByExample(DspAdvertLabelExample example);

    int deleteByExample(DspAdvertLabelExample example);

    int deleteByPrimaryKey(Long id);

    int insert(DspAdvertLabel record);

    int insertSelective(DspAdvertLabel record);

    List<DspAdvertLabel> selectByExample(DspAdvertLabelExample example);

    DspAdvertLabel selectByPrimaryKey(Long id);

    int updateByExampleSelective(@Param("record") DspAdvertLabel record, @Param("example") DspAdvertLabelExample example);

    int updateByExample(@Param("record") DspAdvertLabel record, @Param("example") DspAdvertLabelExample example);

    int updateByPrimaryKeySelective(DspAdvertLabel record);

    Integer insertBatch(Map<String, Object> map);
}