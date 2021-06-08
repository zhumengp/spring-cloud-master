package org.com.zhump.dsp.service.impl;

import lombok.extern.log4j.Log4j2;
import org.com.zhump.dsp.dao.DspAdvertLabelMapper;
import org.com.zhump.dsp.entity.AdvertTaskLabelBasic;
import org.com.zhump.dsp.entity.DspAdvertLabel;
import org.com.zhump.dsp.entity.DspAdvertLabelExample;
import org.com.zhump.dsp.service.IDspAdvertLable;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;


@Service(value = "IDspAdvertLable")
@Log4j2
public class DspAdvertLableImpl implements IDspAdvertLable {

    @Autowired
    private DspAdvertLabelMapper dspAdvertLabelMapper;

    /**
     * 新增标签
     * @param adId
     * @param crowdId
     * @param list
     * @return
     */
    @Override
    public boolean insertBatch(String adId,String crowdId,List<AdvertTaskLabelBasic> list) {
        if (list == null || list.size() <= 0){
            return true;
        }
        List<DspAdvertLabel> lableList = list.stream().map(action ->{
            DspAdvertLabel dspAdvertLabel = new DspAdvertLabel();
            dspAdvertLabel.setAdId(adId);
            dspAdvertLabel.setCrowdId(crowdId);
            dspAdvertLabel.setLabelId(action.getLableId());
            return dspAdvertLabel;
        }).collect(Collectors.toList());
        Map<String,Object> map = new HashMap<>();
        map.put("items",lableList);
        Integer result = dspAdvertLabelMapper.insertBatch(map);
        return result > 0 ? true : false;
    }


    /**
     * 删除
     * @param adId 任务ID
     * @param crowdId 包ID
     * @return
     */
    @Override
    public boolean delete(String adId, String crowdId) {
        DspAdvertLabelExample example = new DspAdvertLabelExample();
        example.createCriteria().andAdIdEqualTo(adId).andCrowdIdEqualTo(crowdId);
        int result = dspAdvertLabelMapper.deleteByExample(example);
        return result > 0 ? true : false;
    }
}
