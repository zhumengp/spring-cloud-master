package org.com.zhump.mssp.web.dto;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class MsspPremissionAddDTO {
    /**系统ID*/
    private Integer systemId;
    /**父Id*/
    private Integer pid;
    private String name;
    /**类型 1：菜单 2： 目录 3：按钮*/
    private Byte type;
    private String permissionValue;
    private String uri;
    private String icon;
    /**状态 1：启动 2：禁用*/
    private Byte status;
    /**排序*/
    private Long orders;


     }
