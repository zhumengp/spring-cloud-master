package org.com.zhump.dsp.entity;

import lombok.Getter;
import lombok.Setter;

import java.util.Date;

@Getter
@Setter
public class DspAdvertLabel {
    private Long id;

    private String adId;

    private String labelId;

    private Integer tagValueType;

    private Date createTime;

    private Date updateTime;

    private String crowdId;
}