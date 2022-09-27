package com.theking.common.exception;

import lombok.extern.slf4j.Slf4j;
import org.apache.ibatis.javassist.NotFoundException;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestControllerAdvice;

import javax.security.sasl.AuthenticationException;

@Slf4j
@RestControllerAdvice(basePackages = {"com.theking.pc"})
public class RestExceptionHandler {

    @ExceptionHandler(Exception.class)
    @ResponseStatus(HttpStatus.INTERNAL_SERVER_ERROR)
    public ResultData<String> excption(Exception e) {
        log.error("全局异常信息 ex={}", e.getMessage(), e);
        if (e instanceof AuthenticationException) {
            return ResultData.fail(ReturnCode.RC401.getCode(), e.getMessage());
        } else if (e instanceof NotFoundException) {
            return ResultData.fail(ReturnCode.RC404.getCode(), e.getMessage());
        } else {
            return ResultData.fail(ReturnCode.RC500.getCode(), e.getMessage());
        }
    }

}
