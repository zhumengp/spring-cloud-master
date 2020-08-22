package org.com.zhump.mssp.web.dto;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@ApiModel(value = "系统新增")
public class MsspSystemEditDTO {

    @ApiModelProperty(value = "系统ID")
    private Integer id;
    @ApiModelProperty(value = "图标")
    private String icon;
    @ApiModelProperty(value = "背景")
    private String banner;
    @ApiModelProperty(value = "主题")
    private String theme;
    @ApiModelProperty(value = "根目录")
    private String basepath;
    @ApiModelProperty(value = "状态(-1:黑名单,1:正常)")
    private Byte status;
    @ApiModelProperty(value = "系统名称")
    private String name;
    @ApiModelProperty(value = "系统标题")
    private String title;
    @ApiModelProperty(value = "系统描述")
    private String description;
    @ApiModelProperty(value = "排序")
    private Long orders;

}

