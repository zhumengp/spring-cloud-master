package com.zhump.web;

import com.zhump.service.IMsspAdvertTaskService;
import org.com.zhump.result.BaseResult;
import org.com.zhump.enums.ErrorEnum;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

@RestController
@RequestMapping(value = "/advertTask/")
public class TestController {


    @Resource
    private IMsspAdvertTaskService msspAdvertTaskService;

    @RequestMapping(value = "/getByAdId/{ad_id}")
    public BaseResult getByAdId(@PathVariable(value = "ad_id")String ad_id){
        BaseResult byId = msspAdvertTaskService.getByAdId(ad_id);
        return byId;
    }
}
