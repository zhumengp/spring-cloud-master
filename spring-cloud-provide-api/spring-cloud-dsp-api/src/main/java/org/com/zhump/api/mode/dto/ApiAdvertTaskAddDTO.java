package org.com.zhump.api.mode.dto;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Getter;
import lombok.Setter;

import java.util.List;


@Getter
@Setter
@ApiModel
public class ApiAdvertTaskAddDTO {


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
    @ApiModelProperty(value = "广告类型")
    private Integer sendType;
    @ApiModelProperty(value = "投放时间段")
    private String pushTime;
    @ApiModelProperty(value = "广告主编码")
    private String cropCode;
    @ApiModelProperty(value = "广告内容")
    private String adContent;
    @ApiModelProperty(value = "机构ID")
    private Long orgId;

    private List<ApiAdvertTaskAreasDTO> apiAdvertTaskAreasDtos;


}
