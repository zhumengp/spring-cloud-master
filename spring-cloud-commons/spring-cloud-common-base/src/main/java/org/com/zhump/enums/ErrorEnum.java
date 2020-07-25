package org.com.zhump.enums;


import org.codehaus.jackson.map.annotate.JsonSerialize;

import java.io.Serializable;

/**
 * 公共枚举值
 */
@JsonSerialize(include = JsonSerialize.Inclusion.NON_NULL)
public enum ErrorEnum implements Serializable {


    DSP00000001("00000001","操作失败"),
    DSP00000002("00000002","DSP广告平台异常"),


    MSSP00000001("00000001","操作失败"),
    MSSP00000002("00000002","MSSP运营管理平台异常")
    ;

    private String code;

    private String msg;

    ErrorEnum(String code, String msg) {
        this.code = code;
        this.msg = msg;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public String getMsg() {
        return msg;
    }

    public void setMsg(String msg) {
        this.msg = msg;
    }
}
