package org.com.zhump.dsp.web.dto;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

@ApiModel(value = "列表查询请求参数")
@Data
public class AdvertTaskListDTO {

    @ApiModelProperty(value = "广告主题")
    private String adTheme;

    @ApiModelProperty(value = "广告审核状态")
    private Integer adAudit;
}
