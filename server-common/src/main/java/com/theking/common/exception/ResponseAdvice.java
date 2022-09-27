package com.theking.common.exception;

import com.fasterxml.jackson.databind.ObjectMapper;
import lombok.SneakyThrows;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.MethodParameter;
import org.springframework.http.MediaType;
import org.springframework.http.converter.HttpMessageConverter;
import org.springframework.http.server.ServerHttpRequest;
import org.springframework.http.server.ServerHttpResponse;
import org.springframework.web.bind.annotation.RestControllerAdvice;
import org.springframework.web.servlet.mvc.method.annotation.ResponseBodyAdvice;

/**
 * @author TheKing
 * @version 1.0
 * @className ResponseAdvice
 * @description
 * @date 2022/9/19 15:00
 */
@RestControllerAdvice(basePackages = {"com.theking.pc"})
public class ResponseAdvice implements ResponseBodyAdvice<Object> {

    private final ObjectMapper objectMapper;

    @Autowired
    public ResponseAdvice(ObjectMapper objectMapper){
        this.objectMapper = objectMapper;
    }

    @Override
    public boolean supports(MethodParameter returnType, Class<? extends HttpMessageConverter<?>> converterType){
        return true;
    }

    @SneakyThrows
    @Override
    public Object beforeBodyWrite(Object object, MethodParameter returnType, MediaType selectedContentType, Class<? extends HttpMessageConverter<?>> selectedConverterType, ServerHttpRequest request, ServerHttpResponse response){
        if (object instanceof String){
            return objectMapper.writeValueAsString(ResultData.success(object));
        }

        if (object instanceof ResultData){
            return object;
        }

        return ResultData.success(object);
    }
}
