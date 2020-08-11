package org.com.zhump.dsp.service;

import org.com.zhump.dsp.entity.DspAdvertTask;
import org.com.zhump.dsp.entity.DspAdvertTaskExample;
import org.com.zhump.dsp.entity.DspAdvertTaskWithBLOBs;
import org.apache.ibatis.annotations.Param;
import org.com.zhump.dsp.web.dto.AdvertTaskAddDTO;

import java.util.List;

public interface IDspAdvertTask {


    /**根据指定参数删除*/
    int deleteByExample(DspAdvertTaskExample example);
    /**新增*/
    boolean insertSelective(AdvertTaskAddDTO advertTaskAdd);
}
