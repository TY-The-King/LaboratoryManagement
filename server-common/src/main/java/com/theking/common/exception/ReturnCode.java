package com.theking.common.exception;

public enum ReturnCode {

    RC200(200,"操作成功"),

    RC404(404,"内容不存在"),

    RC500(500,"服务器内部异常，请联系管理员");

    private final int code;

    private final String mes;

    public int getCode() {
        return code;
    }

    public String getMes() {
        return mes;
    }

    ReturnCode(int code, String mes){
        this.code = code;
        this.mes = mes;
    }
}
