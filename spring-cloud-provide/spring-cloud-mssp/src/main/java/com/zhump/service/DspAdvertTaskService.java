package com.zhump.service;

import com.zhump.api.service.DspAdvertTaskFeignApi;
import org.com.zhump.result.BaseResult;
import org.springframework.stereotype.Component;

import javax.annotation.Resource;

@Component
public class DspAdvertTaskService {

    @Resource
    private DspAdvertTaskFeignApi dspAdvertTaskFeginApi;

    public BaseResult getByAdId(String ad_id){
        return dspAdvertTaskFeginApi.getByAdId(ad_id);
    }

}
