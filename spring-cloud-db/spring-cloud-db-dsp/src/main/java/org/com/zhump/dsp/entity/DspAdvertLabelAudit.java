package org.com.zhump.dsp.entity;

import lombok.Data;

import java.sql.Timestamp;

@Data
public class DspAdvertLabelAudit {
    private Long id;

    private String adId;

    private Integer labelId;

    private Integer tagValueType;

    private Long minValue;

    private Long maxValue;

    private Timestamp createTime;

    private Timestamp updateTime;

}