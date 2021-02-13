package com.yeriri.controller;


import com.yeriri.commom.lang.Result;
import com.yeriri.entity.User;
import com.yeriri.service.UserService;
import lombok.extern.slf4j.Slf4j;
import org.apache.shiro.authz.annotation.RequiresAuthentication;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;

/**
 * <p>
 *  前端控制器
 * </p>
 *
 * @author y_eriri
 * @since 2021-02-09
 */

@RestController
@RequestMapping("/user")
public class UserController {
    @Autowired
    UserService userService;

    @RequiresAuthentication
    @GetMapping("/index")
    public Object index(){
        User user = userService.getById(1L);

        return Result.succ(user);
    }

    @PostMapping("/save")
    public Result save (@Validated @RequestBody User user){

        return Result.succ(user);
    }

}
