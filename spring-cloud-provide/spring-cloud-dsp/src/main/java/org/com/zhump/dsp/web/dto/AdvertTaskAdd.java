package org.com.zhump.dsp.web.dto;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Getter;
import lombok.Setter;


@Getter
@Setter
@ApiModel
public class AdvertTaskAdd {

    @ApiModelProperty(value = "广告主题")
    private String adTheme;
    @ApiModelProperty(value = "总投放额")
    private Long totalCount;
    @ApiModelProperty(value = "日限额")
    private Long dailyLimit;
    @ApiModelProperty(value = "投放开始时间")
    private Integer effectDate;
    @ApiModelProperty(value = "投放结束时间")
    private Integer expiryDate;
    @ApiModelProperty(value = "投放结束时间")
    private Integer sendType;
    @ApiModelProperty(value = "投放时间段")
    private String pushTime;
    @ApiModelProperty(value = "审核状态")
    private Integer auditState;
    @ApiModelProperty(value = "模板ID")
    private String templateId;
    @ApiModelProperty(value = "指令")
    private String replyDesc;
    @ApiModelProperty(value = "复用ID")
    private String copyAdId;
    @ApiModelProperty(value = "流量主编码")
    private String qualityIds;
    @ApiModelProperty(value = "是否营销")
    private Integer market;
    @ApiModelProperty(value = "广告内容")
    private String adContent;

}
