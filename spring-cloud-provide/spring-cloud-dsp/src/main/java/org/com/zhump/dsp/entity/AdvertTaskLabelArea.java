package org.com.zhump.dsp.entity;

import lombok.Getter;
import lombok.Setter;

/**
 * 省市区区域标签
 */
@Setter
@Getter
public class AdvertTaskLabelArea {

    /**省*/
    private String province;
    /**市*/
    private String city;
    /**区*/
    private String regionCode;
    /**详细地址*/
    private String address;
}
