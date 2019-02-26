package com.windlazio.study.controller;

import com.windlazio.study.model.User;
import com.windlazio.study.service.IUserService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.servlet.http.HttpServletRequest;

@Controller
@RequestMapping("/user")
public class UserController {
    private static Logger log= LoggerFactory.getLogger(UserController.class);

    @Autowired
    private IUserService userService;

    @RequestMapping(value = "/find")
    public String findUser(HttpServletRequest request, Model model)
    {
        int userId=Integer.parseInt(request.getParameter("id"));
        System.out.println("userId="+userId);
        User user=userService.getUserById(userId);
        log.warn(user.toString());
        System.out.println(user.toString());
        model.addAttribute("user",user);
        return "index";
    }

    @RequestMapping(value = "/add")
    public String addUser(Model model)
    {
        User user=new User();
        user.setAge(11);
        user.setPassword("123456");
        user.setUsername("pavel");
        log.warn("add user"+user.toString());
        userService.insertUser(user);
        model.addAttribute("user",user);
        return "index";
    }

    @RequestMapping(value = "/delete")
    public String addUser(HttpServletRequest request)
    {
        int userId=Integer.parseInt(request.getParameter("id"));
        log.warn("delete user"+userId);
        userService.deleteUserById(userId);
        return "index";
    }

    @RequestMapping(value = "/update")
    public String updateUser(Model model)
    {
        User user=new User();
        user.setId(4);
        user.setAge(22);
        user.setPassword("asdasdsdsasd");
        user.setUsername("sinal123");
        log.warn("add user"+user.toString());
        userService.upodateUser(user);
        model.addAttribute("user",user);
        return "index";
    }

}
