package org.com.zhump.api.service.hystrix;

import org.com.zhump.api.service.DspAdvertTaskFeignApi;
import org.com.zhump.result.BaseResult;
import org.com.zhump.enums.ErrorEnum;
import org.com.zhump.result.Result;
import org.springframework.stereotype.Component;

/**
 * 熔断机制
 */
@Component
public class DspAdvertTaskFeignHystrix implements DspAdvertTaskFeignApi {

    @Override
    public BaseResult getByAdId(String ad_id) {
        return Result.wrap(ErrorEnum.DSP00000002.getCode(),ErrorEnum.DSP00000002.getMsg());
    }
}
