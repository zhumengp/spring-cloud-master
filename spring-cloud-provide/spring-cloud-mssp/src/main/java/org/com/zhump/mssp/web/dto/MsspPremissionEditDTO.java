package org.com.zhump.mssp.web.dto;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@ApiModel(value = "资源编辑实体类")
public class MsspPremissionEditDTO {

    @ApiModelProperty(value = "资源ID")
    private Integer id;
    /**系统ID*/
    @ApiModelProperty(value = "系统编号")
    private Integer systemId;
    /**父Id*/
    @ApiModelProperty(value = "父ID")
    private Integer pid;
    @ApiModelProperty(value = "资源名称")
    private String name;
    /**类型 1：菜单 2： 目录 3：按钮*/
    @ApiModelProperty(value = "类型")
    private Byte type;
    @ApiModelProperty(value = "资源权限")
    private String permissionValue;
    @ApiModelProperty(value = "资源访问地址")
    private String uri;
    @ApiModelProperty(value = "图标")
    private String icon;
    /**状态 1：启动 2：禁用*/
    @ApiModelProperty(value = "状态")
    private Byte status;
    /**排序*/
    @ApiModelProperty(value = "排序")
    private Long orders;


     }
