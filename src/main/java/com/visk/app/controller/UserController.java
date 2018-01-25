package com.visk.app.controller;

import com.visk.app.common.utils.*;
import com.visk.app.domain.*;
import com.visk.app.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.context.support.DefaultMessageSourceResolvable;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.MethodArgumentNotValidException;
import org.springframework.web.bind.annotation.*;
import javax.validation.Valid;

@RestController
@RequestMapping("/user")
public class UserController {

    @Autowired
    private UserService userService;

    @RequestMapping(value = "/hi", method = RequestMethod.GET)
    public String say(){

        return "Spring Boot Test";
    }

    @RequestMapping(value = "/getList", method = RequestMethod.GET)
    public Result getList(@RequestParam("uid") Long uid){

        User row = userService.getAllUser(uid);
        if(row != null){
            return ResultUtil.success(row);
        }else {
            return ResultUtil.errors(ResultEnum.USER_ERR);
        }
    }

}
