package com.edmar.mll.controller;

import com.edmar.mll.common.AjaxResult;
import com.edmar.mll.entity.User;
import com.edmar.mll.repository.UserReposity;
import org.aspectj.weaver.loadtime.Aj;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Example;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;
import java.util.Optional;

@RestController
public class LoginController {
    @Autowired
    UserReposity userReposity;

    @PostMapping("/login")
    public AjaxResult login(User user, HttpSession session) {
        Optional  optional= getUser(user);
        if (optional == null) {
            return AjaxResult.error("用户名或密码错误！");
        }
        session.setAttribute("user",user);
        return AjaxResult.success(optional);
    }

    public Optional getUser(User user) {
         Example<User> example = Example.of(user);
         Optional<User> optional = userReposity.findOne(example);
         return  optional;
    }

    @GetMapping("/logout")
    public String logout(HttpSession session) {
        session.invalidate();
        return "login";
    }

}
