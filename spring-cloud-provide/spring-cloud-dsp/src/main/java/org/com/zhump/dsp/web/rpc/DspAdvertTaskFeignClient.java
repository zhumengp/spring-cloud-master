package org.com.zhump.dsp.web.rpc;

import org.com.zhump.api.service.DspAdvertTaskFeignApi;
import org.com.zhump.dsp.entity.DspAdvertTaskExample;
import org.com.zhump.dsp.entity.DspAdvertTaskWithBLOBs;
import org.com.zhump.dsp.service.IDspAdvertTask;
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
    public BaseResult getByAdId(@PathVariable(value = "ad_id") String ad_id) {
        log.info("进入广告平台-接口名称,getByAdId,查询ID:{}",ad_id);
        DspAdvertTaskExample example = new DspAdvertTaskExample();
        example.createCriteria().andAdIdEqualTo(ad_id);
        List<DspAdvertTaskWithBLOBs> list = dspAdvertTask.selectByExampleWithBLOBs(example);
        if (list != null && list.size() > 0){
            return Result.ok(list.get(0));
        }
        return Result.wrap(ErrorEnum.DSP10000003.getCode(), ErrorEnum.DSP10000003.getMsg());
    }
}
