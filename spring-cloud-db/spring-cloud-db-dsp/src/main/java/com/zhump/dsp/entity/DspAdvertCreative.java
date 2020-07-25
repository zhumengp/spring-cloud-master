package com.zhump.dsp.entity;

import lombok.Data;

import java.util.Date;

@Data
public class DspAdvertCreative {
    private Long id;

    private String name;

    private String corpCode;

    private Date createTime;

    private Date updateTime;

    private Integer templateId;

    private String replyDesc;

    private Integer orgId;

    private Byte hot;

    private String tagName;

    private String content;

}