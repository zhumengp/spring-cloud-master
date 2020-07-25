package com.zhump.api.service;

import com.zhump.api.service.hystrix.DspAdvertTaskFeignHystrix;
import org.com.zhump.result.BaseResult;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

@FeignClient(name = "dsp-service-impl",fallback = DspAdvertTaskFeignHystrix.class)
public interface DspAdvertTaskFeignApi {

    @GetMapping("/api/advertTask/getByAdId/{ad_id}")
    public BaseResult getByAdId(@PathVariable(value = "ad_id")String string);
}
