package org.com.zhump.dsp.web.rpc;

import com.baidu.unbiz.fluentvalidator.ComplexResult;
import com.baidu.unbiz.fluentvalidator.FluentValidator;
import com.baidu.unbiz.fluentvalidator.ResultCollectors;
import org.com.zhump.api.mode.dto.ApiAdvertTaskAddDTO;
import org.com.zhump.api.service.DspAdvertTaskFeignApi;
import org.com.zhump.dsp.entity.DspAdvertTaskExample;
import org.com.zhump.dsp.entity.DspAdvertTaskWithBLOBs;
import org.com.zhump.dsp.service.IDspAdvertTask;
import lombok.extern.log4j.Log4j2;
import org.com.zhump.result.BaseResult;
import org.com.zhump.enums.ErrorEnum;
import org.com.zhump.result.Result;
import org.com.zhump.util.SerialNumBuilderUtil;
import org.com.zhump.validator.NotNullValidator;
import org.springframework.beans.BeanUtils;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import java.util.List;

@RestController
@Log4j2
public class DspAdvertTaskFeignClient implements DspAdvertTaskFeignApi {

    @Resource
    private IDspAdvertTask dspAdvertTask;

    @Override
    public BaseResult getByAdId(@PathVariable(value = "adId") String adId) {
        ComplexResult result = FluentValidator.checkAll()
                                                        .on(adId,new NotNullValidator("任务ID"))
                                                        .doValidate()
                                                        .result(ResultCollectors.toComplex());
        if (!result.isSuccess()){
            return Result.wrap(ErrorEnum.DSP10000002.getCode(),ErrorEnum.DSP10000002.getMsg(),result.getErrors());
        }
        log.info("进入广告平台-接口名称,getByAdId,查询ID:{}",adId);
        DspAdvertTaskExample example = new DspAdvertTaskExample();
        example.createCriteria().andAdIdEqualTo(adId);
        List<DspAdvertTaskWithBLOBs> list = dspAdvertTask.selectByExampleWithBLOBs(example);
        if (list != null && list.size() > 0){
            return Result.ok(list.get(0));
        }
        return Result.wrap(ErrorEnum.DSP10000003.getCode(), ErrorEnum.DSP10000003.getMsg());
    }

    /**
     * 新增广告
     * @param apiAdvertTaskAddDto
     * @return
     */
    @Override
    public BaseResult add(@RequestBody ApiAdvertTaskAddDTO apiAdvertTaskAddDto) {
        ComplexResult result = FluentValidator.checkAll()
                .on(apiAdvertTaskAddDto.getAdContent(),new NotNullValidator("任务内容"))
                .on(apiAdvertTaskAddDto.getAdTheme(),new NotNullValidator("主题"))
                .on(apiAdvertTaskAddDto.getCropCode(),new NotNullValidator("广告主编码"))
                .on(apiAdvertTaskAddDto.getPushTime(),new NotNullValidator("投放时间段"))
                .on(apiAdvertTaskAddDto.getTotalCount().toString(),new NotNullValidator("总投放额"))
                .doValidate()
                .result(ResultCollectors.toComplex());
        if (!result.isSuccess()){
            return Result.wrap(ErrorEnum.DSP10000002.getCode(),ErrorEnum.DSP10000002.getMsg(),result.getErrors());
        }
        boolean falg = dspAdvertTask.insertSelective(apiAdvertTaskAddDto);
        if ( falg){
            log.info("新增任务成功,生成任务主題：{},广告主编码：{}",apiAdvertTaskAddDto.getAdTheme(),apiAdvertTaskAddDto.getCropCode());
            return Result.ok();
        }
        return Result.wrap(ErrorEnum.DSP10000003.getCode(), ErrorEnum.DSP10000003.getMsg());
    }
}
