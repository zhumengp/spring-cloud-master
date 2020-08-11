package org.com.zhump.dsp.entity;

import lombok.Getter;
import lombok.Setter;

import java.util.ArrayList;
import java.util.List;

@Getter
@Setter
public class AdvertTaskLabelCrowdRadius {

    /**半径范围*/
    private Long scope;
    /**手动输入地址*/
    private List<AdvertTaskLabelCrowdRadius_Item> AdvertTaskLabelCrowdRadiusItem = new ArrayList<>();


    @Getter
    @Setter
    public static class AdvertTaskLabelCrowdRadius_Item {

        /**详细地址*/
        private String address;
        /**经纬度*/
        private String coordinate;
    }
}
