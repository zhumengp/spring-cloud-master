package org.com.zhump.dsp.service;

import org.com.zhump.api.mode.dto.ApiAdvertTaskAreasDTO;
import org.com.zhump.dsp.entity.DspAdvertAreas;

import java.util.List;
import java.util.Map;

public interface IDspAdvertAreas {



    Integer insertBatch(List<DspAdvertAreas> list);

    boolean insertBatchApi(String adId,String crowdId,List<ApiAdvertTaskAreasDTO> list);

}
