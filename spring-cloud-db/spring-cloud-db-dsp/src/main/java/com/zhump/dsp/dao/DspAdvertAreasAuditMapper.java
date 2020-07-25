package com.zhump.dsp.dao;

import com.zhump.dsp.entity.DspAdvertAreasAudit;
import com.zhump.dsp.entity.DspAdvertAreasAuditExample;
import org.apache.ibatis.annotations.Param;

import java.util.List;
import java.util.Map;

public interface DspAdvertAreasAuditMapper {
    int countByExample(DspAdvertAreasAuditExample example);

    int deleteByExample(DspAdvertAreasAuditExample example);

    int insertSelective(DspAdvertAreasAudit record);

    List<DspAdvertAreasAudit> selectByExample(DspAdvertAreasAuditExample example);

    DspAdvertAreasAudit selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") DspAdvertAreasAudit record, @Param("example") DspAdvertAreasAuditExample example);

    int updateByPrimaryKeySelective(DspAdvertAreasAudit record);

    Integer insertBatch(Map<String, Object> map);
}