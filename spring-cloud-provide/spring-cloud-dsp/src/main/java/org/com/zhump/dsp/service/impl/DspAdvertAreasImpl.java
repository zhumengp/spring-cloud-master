package org.com.zhump.dsp.service.impl;

import lombok.extern.log4j.Log4j2;
import org.com.zhump.api.mode.dto.ApiAdvertTaskAreasDTO;
import org.com.zhump.dsp.dao.DspAdvertAreasMapper;
import org.com.zhump.dsp.entity.DspAdvertAreas;
import org.com.zhump.dsp.service.IDspAdvertAreas;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * 新增地域信息
 */
@Service(value = "IDspAdvertAreas")
@Log4j2
public class DspAdvertAreasImpl implements IDspAdvertAreas {

    @Resource
    private DspAdvertAreasMapper dspAdvertAreasMapper;

    /**
     * 批量新增地域
     * @param list
     * @return
     */
    @Override
    public Integer insertBatch(List<DspAdvertAreas> list) {
        Map<String,Object> map = new HashMap<>();
        map.put("items",list);
        return dspAdvertAreasMapper.insertBatchAreas1(map);
    }

    /**
     * 新增
     * @param adId
     * @param crowdId
     * @param list
     * @return
     */
    @Override
    public boolean insertBatchApi(String adId,String crowdId,List<ApiAdvertTaskAreasDTO> list) {
        if (list == null || list.size() <=0){
            return true;
        }
        List<DspAdvertAreas> areas = new ArrayList<>();
        list.stream().forEach(action ->{
            DspAdvertAreas dspAdvertAreas = new DspAdvertAreas();
            dspAdvertAreas.setAdId(adId);
            dspAdvertAreas.setProvince(action.getProvince());
            dspAdvertAreas.setCity(action.getCity());
            dspAdvertAreas.setRegionCode(action.getRegionCode());
            dspAdvertAreas.setAddress("");
            dspAdvertAreas.setCrowdId(crowdId);
            areas.add(dspAdvertAreas);
        });
        Map<String,Object> map = new HashMap<>();
        map.put("items",list);
        Integer integer = dspAdvertAreasMapper.insertBatchAreas2(map);
        return integer > 0 ? true : false;
    }
}
