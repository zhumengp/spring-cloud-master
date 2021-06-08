package org.com.zhump.mssp.exception;

import lombok.extern.log4j.Log4j2;
import org.com.zhump.enums.ErrorEnum;
import org.com.zhump.exception.BusinessException;

@Log4j2
public class MsspBusinessException extends BusinessException {

    /**
     * Instantiates a new MsspBusinessException rpc exception.
     */
    public MsspBusinessException() {
    }

    /**
     * Instantiates a new MsspBusinessException rpc exception.
     *
     * @param code      the code
     * @param msgFormat the msg format
     * @param args      the args
     */
    public MsspBusinessException(int code, String msgFormat, Object... args) {
        super(code, msgFormat, args);
        log.info("<== MsspBusinessException, code:{}, message:{}", this.code, super.getMessage());
    }


    /**
     * Instantiates a new MsspBusinessException rpc exception.
     *
     * @param code the code
     * @param msg  the msg
     */
    public MsspBusinessException(int code, String msg) {
        super(code, msg);
        log.info("<== MsspBusinessException, code:{}, message:{}", this.code, super.getMessage());
    }

    /**
     * 只需要传字符串
     * @param message
     */
    public MsspBusinessException(String message) {
        super(message);
    }

    /**
     * Instantiates a new MsspBusinessException rpc exception.
     *
     * @param codeEnum the code enum
     */
    public MsspBusinessException(ErrorEnum codeEnum) {
        super(codeEnum.getCode(), codeEnum.getMsg());
        log.info("<== MsspBusinessException, code:{}, message:{}", this.code, super.getMessage());
    }

    /**
     * Instantiates a new MsspBusinessException rpc exception.
     *
     * @param codeEnum the code enum
     * @param args     the args
     */
    public MsspBusinessException(ErrorEnum codeEnum, Object... args) {
        super(codeEnum, args);
        log.info("<== MsspBusinessException, code:{}, message:{}", this.code, super.getMessage());
    }
}
