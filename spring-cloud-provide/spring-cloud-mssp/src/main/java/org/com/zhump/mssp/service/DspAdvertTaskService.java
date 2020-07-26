package org.com.zhump.mssp.service;

import org.com.zhump.api.service.DspAdvertTaskFeignApi;
import org.com.zhump.result.BaseResult;
import org.springframework.stereotype.Component;

import javax.annotation.Resource;

@Component
public class DspAdvertTaskService {

    @Resource
    private DspAdvertTaskFeignApi dspAdvertTaskFeignApi;

    public BaseResult getByAdId(String ad_id){
        return dspAdvertTaskFeignApi.getByAdId(ad_id);
    }

}
