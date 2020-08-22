package org.com.zhump.mssp.web.rpc;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiImplicitParam;
import io.swagger.annotations.ApiOperation;
import org.com.zhump.mssp.service.IMsspAdvertTaskService;
import org.com.zhump.result.BaseResult;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

@RestController
@RequestMapping(value = "/advertTask/")
@Api(value = "MSSP - advertTaskController",tags = {"任务管理模块"})
public class AdvertTaskController {


    @Resource
    private IMsspAdvertTaskService msspAdvertTaskService;

    @RequestMapping(value = "/getByAdId/{ad_id}",method = RequestMethod.GET)
    @ApiOperation(httpMethod = "GET",value = "根据广告ID查询任务详情")
    @ApiImplicitParam(name = "ad_id",value = "任务ID")
    public BaseResult getByAdId(@PathVariable(value = "ad_id")String ad_id){
        BaseResult result = msspAdvertTaskService.getByAdId(ad_id);
        return result;
    }
}
