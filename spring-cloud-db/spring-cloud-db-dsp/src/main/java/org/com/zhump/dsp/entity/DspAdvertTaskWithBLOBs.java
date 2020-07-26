package org.com.zhump.dsp.entity;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class DspAdvertTaskWithBLOBs extends DspAdvertTask {

    /**
     * 广告内容
     */
    private String adContent;

    /**
     * 指令描述
     */
    private String paramDesc;

    @Override
    public String toString() {
        return "DspAdvertTaskWithBLOBs{" +
                "adContent='" + adContent + '\'' +
                ", paramDesc='" + paramDesc + '\'' +
                '}';
    }
}