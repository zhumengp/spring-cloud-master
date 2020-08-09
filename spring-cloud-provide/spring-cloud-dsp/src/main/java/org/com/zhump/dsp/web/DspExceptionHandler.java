package org.com.zhump.dsp.web;

import lombok.extern.log4j.Log4j2;
import org.com.zhump.exception.BusinessException;
import org.com.zhump.result.BaseResult;
import org.com.zhump.result.Result;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestControllerAdvice;

@Log4j2
@RestControllerAdvice
public class DspExceptionHandler {


    /**
     * 业务异常.
     *
     * @param e the e
     *
     * @return the wrapper
     */
    @ExceptionHandler(BusinessException.class)
    @ResponseStatus(HttpStatus.OK)
    @ResponseBody
    public BaseResult businessException(BusinessException e) {
        log.error("业务异常={}", e.getMessage(), e);
        return Result.wrap(e.getCode() == 0 ? BaseResult.ERROR_CODE : e.getCode(), e.getMessage());
    }
}
