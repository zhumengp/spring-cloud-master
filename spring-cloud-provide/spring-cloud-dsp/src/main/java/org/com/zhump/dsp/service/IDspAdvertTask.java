package org.com.zhump.dsp.service;

import org.com.zhump.api.mode.dto.ApiAdvertTaskAddDTO;
import org.com.zhump.dsp.entity.DspAdvertTask;
import org.com.zhump.dsp.entity.DspAdvertTaskExample;
import org.com.zhump.dsp.entity.DspAdvertTaskWithBLOBs;
import org.apache.ibatis.annotations.Param;
import org.com.zhump.dsp.web.dto.AdvertTaskAddDTO;

import java.util.List;

public interface IDspAdvertTask {

    /**查询统计数量*/
    int countByExample(DspAdvertTaskExample example);
    /**根据指定参数删除*/
    int deleteByExample(DspAdvertTaskExample example);
    /**新增*/
    boolean insertSelective(ApiAdvertTaskAddDTO apiAdvertTaskAddDto);

    boolean insertSelective(AdvertTaskAddDTO advertTaskAddDto);

    List<DspAdvertTaskWithBLOBs> selectByExampleWithBLOBs(DspAdvertTaskExample example);

    List<DspAdvertTask> selectByExample(DspAdvertTaskExample example);

    int updateByExampleSelective(@Param("record") DspAdvertTaskWithBLOBs record, @Param("example") DspAdvertTaskExample example);

    int updateByPrimaryKeySelective(DspAdvertTaskWithBLOBs record);
}
