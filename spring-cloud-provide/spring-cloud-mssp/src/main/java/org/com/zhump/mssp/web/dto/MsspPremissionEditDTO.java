package org.com.zhump.mssp.web.dto;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class MsspPremissionEditDTO {

    private Integer id;
    private Integer systemId;
    private Integer pid;
    private String name;
    private Byte type;
    private String permissionValue;
    private String uri;
    private String icon;
    private Byte status;
    private Long orders;


     }
