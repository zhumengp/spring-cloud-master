package org.com.zhump.dsp.web.controller;

import com.baidu.unbiz.fluentvalidator.ComplexResult;
import com.baidu.unbiz.fluentvalidator.FluentValidator;
import com.baidu.unbiz.fluentvalidator.ResultCollectors;
import org.apache.commons.lang.StringUtils;
import org.com.zhump.dsp.entity.DspAdvertTaskExample;
import org.com.zhump.dsp.entity.DspAdvertTaskWithBLOBs;
import org.com.zhump.dsp.service.IDspAdvertTask;
import org.com.zhump.dsp.web.dto.AdvertTaskAddDTO;
import org.com.zhump.dsp.web.dto.AdvertTaskEditDTO;
import org.com.zhump.dsp.web.dto.AdvertTaskListDTO;
import io.swagger.annotations.*;
import lombok.extern.log4j.Log4j2;
import org.com.zhump.enums.ErrorEnum;
import org.com.zhump.result.BaseResult;
import org.com.zhump.result.Result;
import org.com.zhump.validator.LengthValidator;
import org.com.zhump.validator.NotNullValidator;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.*;

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
     *详情查询
     * @param ad_id
     * @return
     */
    @RequestMapping(value = "/getById/{ad_id}",method = RequestMethod.GET)
    @ApiOperation(httpMethod = "GET",value = "根据广告ID查询任务详情",response = DspAdvertTaskWithBLOBs.class)
    @ApiImplicitParam(name = "ad_id",value = "任务ID")
    public BaseResult<DspAdvertTaskWithBLOBs> getById(@PathVariable(value = "ad_id") String ad_id){
        log.info("查询广告任务详情ID为,ad_id:{}",ad_id);
        DspAdvertTaskExample example = new DspAdvertTaskExample();
        example.createCriteria().andAdIdEqualTo(ad_id);
        List<DspAdvertTaskWithBLOBs> list = dspAdvertTask.selectByExampleWithBLOBs(example);
        if (list != null && list.size() > 0){
            return Result.ok(list.get(0));
        }
        return Result.ok();

    }

    /**
     * 列表查询
     * @param advertTaskListDto
     * @return
     */
    @RequestMapping(value = "/list/",method = RequestMethod.GET)
    @ApiOperation(httpMethod = "GET",value = "任务列表查询")
    //@ApiResponses(@ApiResponse(code = 200,message = "操作成功",response = DspAdvertTaskWithBLOBs.class))
    public BaseResult list(@RequestBody  AdvertTaskListDTO advertTaskListDto){
        DspAdvertTaskExample example = new DspAdvertTaskExample();
        DspAdvertTaskExample.Criteria criteria =  example.createCriteria();
        if (advertTaskListDto.getAdAudit() != null){
            criteria.andAuditStateEqualTo(advertTaskListDto.getAdAudit());
        }
        if (StringUtils.isNotBlank(advertTaskListDto.getAdTheme())){
            example.or().andAdThemeLike("%"+advertTaskListDto.getAdAudit()+"%");
        }
        List<DspAdvertTaskWithBLOBs> list = dspAdvertTask.selectByExampleWithBLOBs(example);
        return Result.ok(list);
    }

    /**
     * 编辑状态
     * @param
     */
    @RequestMapping(value = "/edit",method = RequestMethod.POST)
    @ApiOperation(httpMethod = "POST",value = "编辑基本信息")
    public BaseResult edit(@RequestBody AdvertTaskEditDTO advertTaskEditDto){
        ComplexResult result = FluentValidator.checkAll()
                .on(advertTaskEditDto.getAd_id(),new NotNullValidator("任务ID"))
                .doValidate()
                .result(ResultCollectors.toComplex());
        if (!result.isSuccess()){
            return Result.wrap(ErrorEnum.DSP10000002.getCode(),ErrorEnum.DSP10000002.getMsg(),result.getErrors());
        }
        log.info("编辑任务ID：{}",advertTaskEditDto.getAd_id());
        DspAdvertTaskExample example = new DspAdvertTaskExample();
        DspAdvertTaskWithBLOBs dspAdvertTaskWithBLOBs = new DspAdvertTaskWithBLOBs();
        example.createCriteria().andAdIdEqualTo(advertTaskEditDto.getAd_id());
        dspAdvertTaskWithBLOBs.setAdState(advertTaskEditDto.getAd_state());
        dspAdvertTaskWithBLOBs.setAdTheme(advertTaskEditDto.getAd_theme());
        int i = dspAdvertTask.updateByExampleSelective(dspAdvertTaskWithBLOBs, example);
        if (i > 0){
            return Result.ok();
        }
        return Result.error();
    }

    /**
     * 删除任务
     * @param ad_id 任务ID
     */
    @RequestMapping(value = "/delete/{ad_id}",method = RequestMethod.DELETE)
    @ApiOperation(httpMethod = "DELETE",value = "删除任务信息")
    public BaseResult delete(@PathVariable(value = "ad_id")String ad_id){
        ComplexResult result = FluentValidator.checkAll()
                .on(ad_id,new NotNullValidator("任务ID"))
                .doValidate()
                .result(ResultCollectors.toComplex());
        if (!result.isSuccess()){
            return Result.wrap(ErrorEnum.DSP10000002.getCode(),ErrorEnum.DSP10000002.getMsg(),result.getErrors());
        }
        log.info("删除任务ID：{}",ad_id);
        DspAdvertTaskExample example = new DspAdvertTaskExample();
        example.createCriteria().andAdIdEqualTo(ad_id);
        int i = dspAdvertTask.deleteByExample(example);
        if (i > 0){
            return Result.ok();
        }
        return Result.error();
    }

    /**
     * 新增任务
     * @param advertTaskAddDto 新增参数
     */
    @RequestMapping(value = "/add",method = RequestMethod.POST)
    @ApiOperation(httpMethod = "POST",value = "新增任务")
    public BaseResult add(@RequestBody AdvertTaskAddDTO advertTaskAddDto){
        ComplexResult result = FluentValidator.checkAll()
                .on(advertTaskAddDto.getAdvertTask().getAdTheme(),new LengthValidator(1,20,"主题"))
                .on(advertTaskAddDto.getAdvertTask().getAdTheme(),new NotNullValidator("主题"))
                .on(advertTaskAddDto.getAdvertTask().getTemplateId(),new NotNullValidator("模板ID"))
                .on(advertTaskAddDto.getAdvertTask().getAdContent(),new NotNullValidator("广告内容"))
                .doValidate()
                .result(ResultCollectors.toComplex());
        if (!result.isSuccess()){
            return Result.wrap(ErrorEnum.DSP10000002.getCode(),ErrorEnum.DSP10000002.getMsg(),result.getErrors());
        }
        boolean b = dspAdvertTask.insertSelective(advertTaskAddDto);
        if (b){
            return Result.ok();
        }
        return Result.error();
    }


}
