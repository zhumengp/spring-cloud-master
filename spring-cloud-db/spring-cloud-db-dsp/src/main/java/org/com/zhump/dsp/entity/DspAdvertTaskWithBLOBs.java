package org.com.zhump.dsp.entity;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class DspAdvertTaskWithBLOBs extends DspAdvertTask {

    private static final long serialVersionUID = -6201438845494146929L;
    /**
     * 广告内容
     */
    private String adContent;

    /**
     * 指令描述
     */
    private String paramDesc;
}