package org.com.zhump.dsp.entity;

import lombok.Data;
import lombok.Getter;
import lombok.Setter;

@Data
public class DspAdvertTaskWithBLOBs extends DspAdvertTask {

    /**
     * 广告内容
     */
    private String adContent;

    /**
     * 指令描述
     */
    private String paramDesc;
}