package com.visk.app.common.utils;

public class BusinessException extends RuntimeException{

    private static Integer code;

    public BusinessException(ResultEnum resultEnum){
        super(resultEnum.getMsg());
        this.code = resultEnum.getCode();
    }

    public void setCode(Integer code) {
        this.code = code;
    }

    public static Integer getCode() {
        return code;
    }

}
