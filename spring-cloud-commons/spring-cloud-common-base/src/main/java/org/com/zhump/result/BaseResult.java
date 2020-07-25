package org.com.zhump.result;



import com.fasterxml.jackson.annotation.JsonIgnore;
import lombok.Getter;
import lombok.Setter;
import org.omg.CORBA.PUBLIC_MEMBER;

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
    public static final String SUCCESS_CODE = "200";
    public static final String SUCCESS_MSG = "操作成功";


    /**
     * public response error_msg
     */
    public static final String ERROR_CODE = "500";
    public static final String ERROR_MSG = "内部错误";

    /**
     * 参数校验统一返回
     * */
    public static final String PARAMS_CODE = "400";
    public static final String PARAMS_MSG = "非法参数";



    /**编码*/
    private String code;
    /**返回描述*/
    private String msg;
    /**返回数据*/
    private T data;

    public BaseResult(){
        this(SUCCESS_CODE,SUCCESS_MSG);
    }

    public BaseResult(String code, String msg){
       this(code,msg,null);
    }

    public BaseResult(String code, String msg, T data) {
        super();
        this.code(code).msg(msg).data(data);
    }

    private BaseResult<T> code(String code) {
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
