package org.com.zhump.dsp.entity;

import lombok.Getter;
import lombok.Setter;

/**
 * 定点人群包
 */
@Getter
@Setter
public class AdvertTaskLabelCrowdArea {

    /**省*/
    private String province;
    /**市*/
    private String city;
    /**区*/
    private String regionCode;
    /**详细地址*/
    private String address;

}
