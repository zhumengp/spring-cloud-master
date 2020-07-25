package com.zhump.dsp.web.controller;

import com.zhump.dsp.entity.DspAdvertTaskExample;
import com.zhump.dsp.entity.DspAdvertTaskWithBLOBs;
import com.zhump.dsp.service.IDspAdvertTask;
import lombok.extern.log4j.Log4j2;
import org.com.zhump.result.BaseResult;
import org.com.zhump.enums.ErrorEnum;
import org.com.zhump.result.Result;
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
public class AdvertTaskController {

    @Resource
    private IDspAdvertTask dspAdvertTask;

    /**
     *
     * @param ad_id
     * @return
     */
    @RequestMapping(value = "/getById/{ad_id}",method = RequestMethod.GET)
    public BaseResult getById(@PathVariable(value = "ad_id") String ad_id){
        try {
            DspAdvertTaskExample example = new DspAdvertTaskExample();
            example.createCriteria().andAdIdEqualTo(ad_id);
            List<DspAdvertTaskWithBLOBs> list = dspAdvertTask.selectByExampleWithBLOBs(example);
            if (list != null && list.size() > 0){
                return Result.ok(list.get(0));
            }
            return Result.wrap(ErrorEnum.DSP00000001.getCode(), ErrorEnum.DSP00000001.getMsg());
        }catch (Exception e){
            log.error("内部错误",e);
            return Result.error();
        }
    }


}
