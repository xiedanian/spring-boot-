package com.visk.app.common.utils;

import com.visk.app.domain.Result;

public class ResultUtil {

    public static Result success(){
        return success(null);
    }

    public static Result success(Object object){
        Result result = new Result();
        result.setErrcode(0);
        result.setErrmsg("success");
        result.setResult(object);
        return result;
    }

    public static Result error(Integer code, String msg){
        Result result = new Result();
        result.setErrcode(code);
        result.setErrmsg(msg);
        return result;
    }

    public static Result errors(ResultEnum resultEnum){
        Result result = new Result();
        result.setErrcode(resultEnum.getCode());
        result.setErrmsg(resultEnum.getMsg());
        return result;
    }

}
