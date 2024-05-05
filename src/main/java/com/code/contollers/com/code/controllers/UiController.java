package com.code.contollers.com.code.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("pages")
public class UiController {

    @GetMapping("/home")
    public String home(Model model) {
        model.addAttribute("name", "Java Gate : Secure Access Hub");
        model.addAttribute("LinkedIn", "in/himanshu-sharma-8b5561231");
        model.addAttribute("Github", "https://github.com/Himanshu4256");
        return "Home";
    }

    @GetMapping("/about")
    public String aboutPage(Model model) {
        model.addAttribute("isLogin", false);
        return "about";
    }

    @GetMapping("/services")
    public String servicesPage() {
        return "services";
    }

    @GetMapping("/login")
    public String loginPage() {
        return "login";
    }

    @GetMapping("/signup")
    public String signupPage() {
        return "signup";
    }

    @GetMapping("/contact")
    public String contactPage() {
        return "contact";
    }

}
