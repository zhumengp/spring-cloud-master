package org.com.zhump.api.service;

import org.com.zhump.api.mode.dto.ApiAdvertTaskAddDTO;
import org.com.zhump.api.service.hystrix.DspAdvertTaskFeignHystrix;
import org.com.zhump.result.BaseResult;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

@FeignClient(name = "dsp",fallback = DspAdvertTaskFeignHystrix.class)
public interface DspAdvertTaskFeignApi {

    /**
     * 查询
     * @param adId
     * @return
     */
    @GetMapping("/api/advertTask/getByAdId/{adId}")
    public BaseResult getByAdId(@PathVariable(value = "adId")String adId);

    /**
     * 新增
     */
    @PostMapping(value = "/api/advertTask/add/")
    public BaseResult add(@RequestBody ApiAdvertTaskAddDTO apiAdvertTaskAddDto);
}
