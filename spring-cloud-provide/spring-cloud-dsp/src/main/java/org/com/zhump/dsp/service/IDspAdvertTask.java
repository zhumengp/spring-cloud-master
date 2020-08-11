package org.com.zhump.dsp.service;

import org.com.zhump.dsp.entity.DspAdvertTask;
import org.com.zhump.dsp.entity.DspAdvertTaskExample;
import org.com.zhump.dsp.entity.DspAdvertTaskWithBLOBs;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface IDspAdvertTask {

    /**查询统计数量*/
    int countByExample(DspAdvertTaskExample example);
    /**根据指定参数删除*/
    int deleteByExample(DspAdvertTaskExample example);
    /**根据ID删除*/
    int deleteByPrimaryKey(Integer id);
    /**新增*/
    boolean insertSelective(DspAdvertTaskWithBLOBs record);

    List<DspAdvertTaskWithBLOBs> selectByExampleWithBLOBs(DspAdvertTaskExample example);

    List<DspAdvertTask> selectByExample(DspAdvertTaskExample example);

    DspAdvertTaskWithBLOBs selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") DspAdvertTaskWithBLOBs record, @Param("example") DspAdvertTaskExample example);

    int updateByPrimaryKeySelective(DspAdvertTaskWithBLOBs record);
}
