package org.com.zhump.dsp.dao;

import org.com.zhump.dsp.entity.DspAdvertLabelAudit;
import org.com.zhump.dsp.entity.DspAdvertLabelAuditExample;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface DspAdvertLabelAuditMapper {
    int countByExample(DspAdvertLabelAuditExample example);

    int deleteByExample(DspAdvertLabelAuditExample example);

    int deleteByPrimaryKey(Long id);


    int insertSelective(DspAdvertLabelAudit record);

    List<DspAdvertLabelAudit> selectByExample(DspAdvertLabelAuditExample example);

    DspAdvertLabelAudit selectByPrimaryKey(Long id);

    int updateByExampleSelective(@Param("record") DspAdvertLabelAudit record, @Param("example") DspAdvertLabelAuditExample example);

    int updateByPrimaryKeySelective(DspAdvertLabelAudit record);

}