package org.com.zhump.mssp.web.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@ApiModel(value = "新增用户参数")
public class MsspUserDTO {

    @ApiModelProperty(name = "用户名")
    private String name;
    @ApiModelProperty(name = "登录账户")
    private String accountName;
    @ApiModelProperty(name = "登录密码")
    private String password;
    @ApiModelProperty(name = "手机号")
    private String phone;
}
