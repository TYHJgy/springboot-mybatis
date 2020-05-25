package my.study.mybatis.controller;

import my.study.mybatis.domain.User;
import my.study.mybatis.mapper.UserMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/user")
public class UserController {
    @Autowired
    private UserMapper userMapper;
    public UserMapper getUserMapper() {
        return userMapper;
    }
    public void setUserMapper(UserMapper userMapper) {
        this.userMapper = userMapper;
    }

    @GetMapping("/id")
    public User getUser(){
        return userMapper.selectUser(1);
    }

}
