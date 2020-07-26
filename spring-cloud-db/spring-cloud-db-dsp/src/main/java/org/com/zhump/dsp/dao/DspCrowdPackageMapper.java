package org.com.zhump.dsp.dao;

import org.com.zhump.dsp.entity.DspCrowdPackage;
import org.com.zhump.dsp.entity.DspCrowdPackageExample;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface DspCrowdPackageMapper {
    int countByExample(DspCrowdPackageExample example);

    int deleteByExample(DspCrowdPackageExample example);

    int deleteByPrimaryKey(Long id);

    int insertSelective(DspCrowdPackage record);

    List<DspCrowdPackage> selectByExampleWithBLOBs(DspCrowdPackageExample example);

    List<DspCrowdPackage> selectByExample(DspCrowdPackageExample example);

    DspCrowdPackage selectByPrimaryKey(Long id);

    int updateByExampleSelective(@Param("record") DspCrowdPackage record, @Param("example") DspCrowdPackageExample example);

    int updateByExampleWithBLOBs(@Param("record") DspCrowdPackage record, @Param("example") DspCrowdPackageExample example);

    int updateByPrimaryKeySelective(DspCrowdPackage record);
}