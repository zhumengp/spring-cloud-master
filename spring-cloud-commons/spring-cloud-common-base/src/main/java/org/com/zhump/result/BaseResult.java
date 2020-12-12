package org.com.zhump.result;



import com.fasterxml.jackson.annotation.JsonIgnore;
import lombok.Getter;
import lombok.Setter;

import java.io.Serializable;

/**
 * 公共返回对象
 */
@Getter
@Setter
public class BaseResult<T>  implements Serializable {

    private static final long serialVersionUID = 3840025399558675154L;
    /**
     * public response code
     */
    public static final int SUCCESS_CODE = 200;
    public static final String SUCCESS_MSG = "操作成功";


    /**
     * public response error_msg
     */
    public static final int ERROR_CODE = 201;
    public static final String ERROR_MSG = "操作失败";

    /**
     * 参数校验统一返回
     * */
    public static final int PARAMS_CODE = 400;
    public static final String PARAMS_MSG = "非法参数";



    /**编码*/
    private int code;
    /**返回描述*/
    private String msg;
    /**返回数据*/
    private T data;

    public BaseResult(){
        this(SUCCESS_CODE,SUCCESS_MSG);
    }

    public BaseResult(int code, String msg){
       this(code,msg,null);
    }

    public BaseResult(int code, String msg, T data) {
        super();
        this.code(code).msg(msg).data(data);
    }

    private BaseResult<T> code(int code) {
        this.setCode(code);
        return this;
    }

    private BaseResult<T> msg(String msg) {
        this.setMsg(msg);
        return this;
    }


    private BaseResult<T> data(T data){
        this.setData(data);
        return this;
    }

    @JsonIgnore
    public boolean success(){
        return BaseResult.SUCCESS_CODE == this.code;
    }

    public boolean error(){
        return !success();
    }

}
