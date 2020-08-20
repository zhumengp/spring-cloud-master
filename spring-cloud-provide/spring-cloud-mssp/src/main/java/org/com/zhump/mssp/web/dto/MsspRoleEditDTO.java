package org.com.zhump.mssp.web.dto;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@ApiModel(value = "编辑角色参数")
public class MsspRoleEditDTO {


    @ApiModelProperty(value = "角色ID")
    private Long roleId;
    @ApiModelProperty(value = "角色名")
    private String name;
    @ApiModelProperty(value = "角色描述")
    private String remark;
}
