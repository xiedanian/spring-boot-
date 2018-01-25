package com.visk.app.common.utils;

public enum ResultEnum {

    ERR(10001,"系统错误"),
    PARAMS_ERR(10002,"参数错误"),
    USER_ERR(10003,"用户不存在");

    private Integer code;
    private String msg;

    ResultEnum( Integer code, String msg){
        this.code = code;
        this.msg = msg;
    }

    public Integer getCode(){
        return  this.code;
    }

    public String getMsg(){
        return this.msg;
    }

}
