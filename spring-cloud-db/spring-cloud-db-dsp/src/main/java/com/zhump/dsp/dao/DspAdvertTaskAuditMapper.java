package com.zhump.dsp.dao;

import com.zhump.dsp.entity.DspAdvertTaskAudit;
import com.zhump.dsp.entity.DspAdvertTaskAuditExample;
import com.zhump.dsp.entity.DspAdvertTaskAuditWithBLOBs;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface DspAdvertTaskAuditMapper {
    int countByExample(DspAdvertTaskAuditExample example);

    int deleteByExample(DspAdvertTaskAuditExample example);

    int deleteByPrimaryKey(Integer id);

    int insertSelective(DspAdvertTaskAuditWithBLOBs record);

    List<DspAdvertTaskAuditWithBLOBs> selectByExampleWithBLOBs(DspAdvertTaskAuditExample example);

    List<DspAdvertTaskAudit> selectByExample(DspAdvertTaskAuditExample example);

    DspAdvertTaskAuditWithBLOBs selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") DspAdvertTaskAuditWithBLOBs record, @Param("example") DspAdvertTaskAuditExample example);

    int updateByPrimaryKeySelective(DspAdvertTaskAuditWithBLOBs record);

    int updateByPrimaryKeyWithBLOBs(DspAdvertTaskAuditWithBLOBs record);
}