package org.com.zhump.mssp.web.dto;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@ApiModel(value = "新增角色参数")
public class MsspRoleAddDTO {

    @ApiModelProperty(value = "角色名")
    private String name;
    @ApiModelProperty(value = "角色描述")
    private String remark;
}
