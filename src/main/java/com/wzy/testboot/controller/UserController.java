package com.wzy.testboot.controller;

import com.wzy.testboot.dao.UserMapper;
import com.wzy.testboot.domain.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.List;

/**
 * Created by beyondLi on 2017/6/19.
 */
//证明是controller层并且返回json
@RestController
public class UserController {
    //依赖注入
    @Autowired
    UserMapper userMapper;

    @RequestMapping(value = "cs")
    public User cs() {
        //调用dao层
        List<User> user = userMapper.selectUserByName();
        return user.get(0);
    }

}