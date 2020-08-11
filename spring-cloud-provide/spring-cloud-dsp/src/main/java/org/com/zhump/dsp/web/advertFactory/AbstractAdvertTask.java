package org.com.zhump.dsp.web.advertFactory;

import org.com.zhump.dsp.web.dto.AdvertTaskAddDTO;

public abstract class AbstractAdvertTask {

    /**
     * 新增广告
     * @param advertTaskAdd
     * @return
     */
    public abstract boolean add(AdvertTaskAddDTO advertTaskAdd);
}
