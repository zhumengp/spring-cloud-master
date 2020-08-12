package org.com.zhump.dsp.entity;


import lombok.Getter;
import lombok.Setter;

import java.util.ArrayList;
import java.util.List;

/**
 * 需要存放的人群包的json格式
 */
@Setter
@Getter
public class AdvertTaskCrowdPackage {


    /**
     * 运营商
     */
    private String ispAllow;
    /**包名*/
    private String packageName;
    /**包描述*/
    private String packageDes;
    /**广告任务基础标签*/
    private List<AdvertTaskLabelBasic> advertTaskLabelBasics = new ArrayList<>();
    /**广告任务地域标签*/
    private List<AdvertTaskLabelArea> advertTaskLabelAreas = new ArrayList<>();
    /**广告任务半径人群包标签*/
    private AdvertTaskLabelCrowdRadius advertTaskLabelCrowdRadius;
    /**广告任务地域人群包标签*/
    private List<AdvertTaskLabelCrowdArea> advertTaskLabelCrowdArea = new ArrayList<>();
    /**数盘对象集*/
    private AdvertTaskCustomPackage dpCustomPackage;

}
