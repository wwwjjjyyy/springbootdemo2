package com.offcn.controller;

import com.offcn.dao.UserDao;
import com.offcn.entity.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@Controller
@RequestMapping("/user")
public class UserController {
    @Autowired
    private UserDao userDao;
    /*@RequestMapping("/user")
    public List<User> getList(){
        List<User> list = userDao.findAll();
        for (User user : list) {
            System.out.println(user);
        }
        return list;
    }*/

    @RequestMapping("/getList")
    public String getUser(Model model){
        List<User> list = userDao.findAll();
        model.addAttribute("list",list);
        return "demo";
    }
}
