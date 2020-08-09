package org.com.zhump.dsp.exception;

import lombok.extern.log4j.Log4j2;
import org.com.zhump.enums.ErrorEnum;
import org.com.zhump.exception.BusinessException;

@Log4j2
public class DspBusinessException extends BusinessException {

    /**
     * Instantiates a new DspBusinessException rpc exception.
     */
    public DspBusinessException() {
    }

    /**
     * Instantiates a new DspBusinessException rpc exception.
     *
     * @param code      the code
     * @param msgFormat the msg format
     * @param args      the args
     */
    public DspBusinessException(int code, String msgFormat, Object... args) {
        super(code, msgFormat, args);
        log.info("<== DspBusinessException, code:{}, message:{}", this.code, super.getMessage());
    }

    /**
     * Instantiates a new DspBusinessException rpc exception.
     *
     * @param code the code
     * @param msg  the msg
     */
    public DspBusinessException(int code, String msg) {
        super(code, msg);
        log.info("<== DspBusinessException, code:{}, message:{}", this.code, super.getMessage());
    }

    /**
     * Instantiates a new DspBusinessException rpc exception.
     *
     * @param codeEnum the code enum
     */
    public DspBusinessException(ErrorEnum codeEnum) {
        super(codeEnum.getCode(), codeEnum.getMsg());
        log.info("<== DspBusinessException, code:{}, message:{}", this.code, super.getMessage());
    }

    /**
     * Instantiates a new DspBusinessException rpc exception.
     *
     * @param codeEnum the code enum
     * @param args     the args
     */
    public DspBusinessException(ErrorEnum codeEnum, Object... args) {
        super(codeEnum, args);
        log.info("<== DspBusinessException, code:{}, message:{}", this.code, super.getMessage());
    }
}
