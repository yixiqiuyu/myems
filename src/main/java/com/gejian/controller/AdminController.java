package com.gejian.controller;

import com.gejian.entity.Admin;
import com.gejian.service.AdminService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/admin")
public class AdminController {

    @Autowired
    AdminService adminService;

    @RequestMapping("/logincheck")
    public String login(Admin admin){
        if (adminService.findByUserNameAndPassword(admin)!=null){
            return "manage";
        }else
            return "login";
    }
}

