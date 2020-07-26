package org.com.zhump.mssp.service.impl;

import org.com.zhump.mssp.service.DspAdvertTaskService;
import org.com.zhump.mssp.service.IMsspAdvertTaskService;
import org.com.zhump.result.BaseResult;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

@Service
public class MsspAdvertTaskServiceImpl implements IMsspAdvertTaskService {

    @Resource
    private DspAdvertTaskService dspAdvertTaskService;

    @Override
    public BaseResult getByAdId(String ad_id) {
        return dspAdvertTaskService.getByAdId(ad_id);
    }
}
