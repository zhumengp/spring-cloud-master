package org.com.zhump.dsp.web.controller;

import org.com.zhump.dsp.entity.DspAdvertTaskExample;
import org.com.zhump.dsp.entity.DspAdvertTaskWithBLOBs;
import org.com.zhump.dsp.service.IDspAdvertTask;
import org.com.zhump.dsp.web.dto.AdvertTaskListDTO;
import io.swagger.annotations.*;
import lombok.extern.log4j.Log4j2;
import org.com.zhump.result.BaseResult;
import org.com.zhump.enums.ErrorEnum;
import org.com.zhump.result.Result;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import java.util.List;

/**
 * 广告控制层
 */
@RestController
@Log4j2
@RequestMapping(value = "/advertTask")
@Api(value = "DSP - AdvertTaskController",tags = {"广告管理控制层"},produces = MediaType.APPLICATION_JSON_UTF8_VALUE)
public class AdvertTaskController {

    @Resource
    private IDspAdvertTask dspAdvertTask;

    /**
     *
     * @param ad_id
     * @return
     */
    @RequestMapping(value = "/getById/{ad_id}",method = RequestMethod.GET)
    @ApiOperation(httpMethod = "GET",value = "根据广告ID查询任务详情",response = DspAdvertTaskWithBLOBs.class)
    @ApiImplicitParam(name = "ad_id",value = "任务ID")
    public BaseResult<DspAdvertTaskWithBLOBs> getById(@PathVariable(value = "ad_id") String ad_id){
        try {
            DspAdvertTaskExample example = new DspAdvertTaskExample();
            example.createCriteria().andAdIdEqualTo(ad_id);
            List<DspAdvertTaskWithBLOBs> list = dspAdvertTask.selectByExampleWithBLOBs(example);
            if (list != null && list.size() > 0){
                log.info("====DSP请求任务详情查询接口:"+list.get(0).toString());
                return Result.ok(list.get(0));
            }
            return Result.wrap(ErrorEnum.DSP00000001.getCode(), ErrorEnum.DSP00000001.getMsg());
        }catch (Exception e){
            log.error("内部错误",e);
            return Result.error();
        }
    }

    @RequestMapping(value = "/list/",method = RequestMethod.GET)
    @ApiOperation(httpMethod = "GET",value = "任务列表查询")
    @ApiResponses(@ApiResponse(code = 200,message = "操作成功",response = DspAdvertTaskWithBLOBs.class))
    public BaseResult list(AdvertTaskListDTO advertTaskListDTO){
        try {
            DspAdvertTaskExample example = new DspAdvertTaskExample();
            //example.createCriteria().andAdThemeLike("%"+advertTaskListDTO.getAd_theme()+"%");
            List<DspAdvertTaskWithBLOBs> list = dspAdvertTask.selectByExampleWithBLOBs(example);
            return Result.ok(list);
        }catch (Exception e){
            log.error("内部错误",e);
            return Result.error();
        }
    }


}
