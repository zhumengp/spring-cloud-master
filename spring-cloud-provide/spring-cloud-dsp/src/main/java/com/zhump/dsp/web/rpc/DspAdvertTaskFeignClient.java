package com.zhump.dsp.web.rpc;

import com.zhump.api.service.DspAdvertTaskFeignApi;
import com.zhump.dsp.entity.DspAdvertTaskExample;
import com.zhump.dsp.entity.DspAdvertTaskWithBLOBs;
import com.zhump.dsp.service.IDspAdvertTask;
import lombok.extern.log4j.Log4j2;
import org.com.zhump.result.BaseResult;
import org.com.zhump.enums.ErrorEnum;
import org.com.zhump.result.Result;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import java.util.List;

@RestController
@Log4j2
public class DspAdvertTaskFeignClient implements DspAdvertTaskFeignApi {

    @Resource
    private IDspAdvertTask dspAdvertTask;

    @Override
    public BaseResult getByAdId(@PathVariable(value = "ad_id") String str) {
        DspAdvertTaskExample example = new DspAdvertTaskExample();
        example.createCriteria().andAdIdEqualTo(str);
        List<DspAdvertTaskWithBLOBs> list = dspAdvertTask.selectByExampleWithBLOBs(example);
        if (list != null && list.size() > 0){
            log.info("进入广告平台-getByAdId：查询任务数据 {}",list.get(0));
            return Result.ok(list.get(0));
        }
        return Result.wrap(ErrorEnum.DSP00000001.getCode(), ErrorEnum.DSP00000001.getMsg());
    }
}
