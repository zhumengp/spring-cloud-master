package org.com.zhump.enums;


import org.codehaus.jackson.map.annotate.JsonSerialize;

import java.io.Serializable;

/**
* Title:ErrorEnum
* Description: 异常枚举类
* @author zhump
* @version 1.0.0
* @date 2021/6/8 23:11
*/
@JsonSerialize(include = JsonSerialize.Inclusion.NON_NULL)
public enum ErrorEnum implements Serializable {

    /**dsp平台*/
    DSP10000001(10000001,"未查询到数据"),
    DSP10000002(10000002,"操作失败"),
    DSP10000003(10000003,"DSP广告平台异常"),
    DSP10000004(10000004,"新增广告数据失败"),
    DSP19999999(19999999,"参数异常"),

    /**mssp平台*/
    MSSP10000001(10000001,"未查询到数据"),
    MSSP10000002(10000002,"操作失败"),
    MSSP10000003(10000003,"MSSP运营管理平台异常"),
    MSSP19999999(19999999,"参数异常")
    ;

    private int code;

    private String msg;

    ErrorEnum(int code, String msg) {
        this.code = code;
        this.msg = msg;
    }

    public int getCode() {
        return code;
    }

    public void setCode(int code) {
        this.code = code;
    }

    public String getMsg() {
        return msg;
    }

    public void setMsg(String msg) {
        this.msg = msg;
    }
}
