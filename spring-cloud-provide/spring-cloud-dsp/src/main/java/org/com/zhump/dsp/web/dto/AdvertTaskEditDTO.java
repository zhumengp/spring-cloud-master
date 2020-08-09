package org.com.zhump.dsp.web.dto;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@ApiModel
public class AdvertTaskEditDTO {

    @ApiModelProperty(value = "任务ID")
    private String ad_id;
    /**主题*/
    @ApiModelProperty(value = "广告主题")
    private String ad_theme;
    /**状态*/
    @ApiModelProperty(value = "广告状态")
    private Integer ad_state;
}
