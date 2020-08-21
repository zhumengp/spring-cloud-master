package org.com.zhump.mssp.web.dto;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class MsspRoleEditDTO {


    private Long roleId;
    private String name;
    private String remark;
}
