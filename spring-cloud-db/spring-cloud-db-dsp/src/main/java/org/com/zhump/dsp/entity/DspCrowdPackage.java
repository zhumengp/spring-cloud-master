package org.com.zhump.dsp.entity;

import lombok.Getter;
import lombok.Setter;

import java.sql.Timestamp;

@Getter
@Setter
public class DspCrowdPackage {

    private Long id;

    private String name;

    private String desciption;

    private Integer category;

    private Integer status;

    private Long orgId;

    private Timestamp createTime;

    private Timestamp updateTime;

    private Integer type;

    private String remakr;

    private Integer dAdId;

    private String corpCode;

    private String content;
}