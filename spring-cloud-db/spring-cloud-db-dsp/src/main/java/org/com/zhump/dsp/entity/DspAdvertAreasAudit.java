package org.com.zhump.dsp.entity;

import lombok.Data;

@Data
public class DspAdvertAreasAudit {

    private Integer id;

    private String adId;

    private String province;

    private String city;

    private String regionCode;

    private String address;

    private String coordinate;

    private Long scope;

    private Integer type;
}