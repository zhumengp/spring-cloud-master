package org.com.zhump.mssp.web.dto;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@ApiModel(value = "新增用户参数")
public class MsspUserAddDTO {

    @ApiModelProperty(value = "用户名")
    private String name;
    @ApiModelProperty(value = "登录账户")
    private String accountName;
    @ApiModelProperty(value = "登录密码")
    private String password;
    @ApiModelProperty(value = "手机号")
    private String phone;
    @ApiModelProperty(value = "邮箱")
    private String email;
    @ApiModelProperty(value = "用户锁")
    private Integer locked;
    @ApiModelProperty(value = "性别")
    private Integer sex;
}
