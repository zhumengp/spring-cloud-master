package org.com.zhump.api.service.hystrix;

import com.netflix.hystrix.contrib.javanica.annotation.HystrixCommand;
import org.com.zhump.api.mode.dto.ApiAdvertTaskAddDTO;
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
    public BaseResult getByAdId(String adId) {
        return Result.wrap(ErrorEnum.DSP10000003.getCode(),ErrorEnum.DSP10000003.getMsg());
    }

    @Override
    public BaseResult add(ApiAdvertTaskAddDTO apiAdvertTaskAddDto) {
        return Result.wrap(ErrorEnum.DSP10000003.getCode(),ErrorEnum.DSP10000003.getMsg());
    }

    @HystrixCommand
    public void test(){

    }
}
