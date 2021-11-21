package com.springproject.fleetms;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class ApplicationController {

    @GetMapping("/index")
    public String home(){
        return "index";
    }
    @GetMapping("/login")
    public String login(){
        return "login";
    }

    @GetMapping("/logout")
    public String logout(){
        return "login";
    }

    @GetMapping("/accounts")
    public String accounts() {
        return "/accounts/index";
    }

    @GetMapping("/boat")
    public String boat() {
        return "/boat/index";
    }

    @GetMapping("/hr")
    public String hr() {
        return "/hr/index";
    }

    @GetMapping("/parameters")
    public String parameters() {
        return "/parameters/index";
    }

    @GetMapping("/payroll")
    public String payroll() {
        return "/payroll/index";
    }

    @GetMapping("/helpdesk")
    public String helpdesk() {
        return "/helpdesk/index";
    }
}
