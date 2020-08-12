package org.com.zhump.dsp.service;

import org.com.zhump.dsp.entity.AdvertTaskLabelBasic;

import java.util.List;

public interface IDspAdvertLable {

    /**新增*/
    boolean insertBatch(String adId,String crowdId,List<AdvertTaskLabelBasic> list);
    /**删除*/
    boolean delete(String adId,String crowdId);
}
