package org.com.zhump.mssp.web.dto;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class MsspUserEditDTO {


    private Long id;
    private String name;
    private String accountName;
    private String password;
    private String phone;
    private String email;
    private Integer locked;
    private Integer sex;
}
