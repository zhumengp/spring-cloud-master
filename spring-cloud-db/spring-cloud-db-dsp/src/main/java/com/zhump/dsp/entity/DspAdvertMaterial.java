package com.zhump.dsp.entity;

import lombok.Data;

import java.sql.Timestamp;

@Data
public class DspAdvertMaterial {
    private Long id;

    private Integer type;

    private String corpCode;

    private String initName;

    private String newName;

    private String fileFormat;

    private String url;

    private String path;

    private Long size;

    private Long duration;

    private String calssify;

    private Long userId;

    private Integer materialSwitch;

    private Timestamp createTime;

    private Timestamp updateTime;

    private Long orgId;

    private String urlS;

    private String pathS;

    private Long sizeS;

    private String urlM;

    private String pathM;

    private Long sizeM;

    private String urlL;

    private String pathL;

    private Long sizeL;

    private Long durationM;

    private Long asytaskid;

}