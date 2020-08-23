package org.com.zhump.mssp.web.dto;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Getter;
import lombok.Setter;

import javax.validation.Valid;

@Getter
@Setter
@ApiModel(value = "角色权限")
public class MsspRolePremissionAddDTO {

    @ApiModelProperty(value = "角色ID")
    private Long roleId;
    @ApiModelProperty(value = "资源ID")
    private Long[] premissionId;
}
