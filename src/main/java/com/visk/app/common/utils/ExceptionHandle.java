package com.visk.app.common.utils;

import com.visk.app.common.utils.*;
import com.visk.app.domain.*;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseBody;
import javax.servlet.http.HttpServletResponse;

@ControllerAdvice
@ResponseBody
public class ExceptionHandle {
    private final static Logger logger = LoggerFactory.getLogger(ExceptionHandle.class);

    @ExceptionHandler(value = Exception.class)
    @ResponseBody
    public Result handler(HttpServletResponse response, Exception e){
        if( e instanceof BusinessException){
            BusinessException businessException = (BusinessException) e;
            return ResultUtil.error( businessException.getCode(), businessException.getMessage());
        }else {
            logger.info("[系统异常] {}",e);
            return ResultUtil.error( -1, "未知错误");
        }
    }
}
