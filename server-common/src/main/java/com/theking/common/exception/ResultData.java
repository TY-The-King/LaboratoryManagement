package com.theking.common.exception;

import lombok.Data;

/**
 * @author TheKing
 * @version 1.0
 * @className ResultData
 * @description
 * @date 2022/9/19 14:59
 */
@Data
public class ResultData<T> {
    private int status;

    private  String message;

    private T data;

    private long timestamp;

    /**设置时间*/
    public ResultData(){
        this.timestamp = System.currentTimeMillis();
    }

    public static <T> ResultData<T> success(T data){
        ResultData<T> resultData = new ResultData<>();
        resultData.setStatus(ReturnCode.RC200.getCode());
        resultData.setMessage(ReturnCode.RC200.getMes());
        resultData.setData(data);
        return resultData;
    }

    public static <T> ResultData<T> fail(int code, String message){
        ResultData<T> resultData = new ResultData<>();
        resultData.setStatus(code);
        resultData.setMessage(message);
        return resultData;
    }
}
