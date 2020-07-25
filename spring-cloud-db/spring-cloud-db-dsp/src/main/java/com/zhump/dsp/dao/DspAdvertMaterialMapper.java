package com.zhump.dsp.dao;

import com.zhump.dsp.entity.DspAdvertMaterial;
import com.zhump.dsp.entity.DspAdvertMaterialExample;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface DspAdvertMaterialMapper {
    int countByExample(DspAdvertMaterialExample example);

    int deleteByExample(DspAdvertMaterialExample example);

    int deleteByPrimaryKey(Long id);

    int insertSelective(DspAdvertMaterial record);

    List<DspAdvertMaterial> selectByExample(DspAdvertMaterialExample example);

    DspAdvertMaterial selectByPrimaryKey(Long id);

    int updateByExampleSelective(@Param("record") DspAdvertMaterial record, @Param("example") DspAdvertMaterialExample example);

    int updateByPrimaryKeySelective(DspAdvertMaterial record);

}