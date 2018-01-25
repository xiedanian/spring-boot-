package com.visk.app.service;

import com.visk.app.domain.*;
import com.visk.app.common.utils.*;
import org.springframework.stereotype.Service;

@Service("userService")
public class UserService {

    public User getAllUser(Long uid){

        if (uid == null ){
            throw new BusinessException(ResultEnum.PARAMS_ERR);
        }

        return null;
    }
}
