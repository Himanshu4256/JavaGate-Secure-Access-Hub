package com.code.contollers.com.code.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.code.entities.User;
import com.code.forms.UserForm;
import com.code.services.UserService;

@Controller
// @RequestMapping("pages")
public class UiController {

    @Autowired
    private UserService userService;

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

    @GetMapping("/register")
    public String singup(Model model) {
        UserForm userForm = new UserForm();
        model.addAttribute("userForm", userForm);
        userForm.setName("Himanshu");
        return "signup";
    }

    @PostMapping("/register")
    public String signupProcessing(@ModelAttribute UserForm form) {
        User user = User.builder()
                .name(form.getName())
                .email(form.getEmail())
                .password(form.getPassword())
                .about(form.getAbout())
                .profilePic(
                        "https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcTjdLBPtVBiGPQ4LrKanWvkPFbQTTcnvGoOEg&s")
                .build();

        User savedUser = userService.saveUser(user);
        return "register";
    }

    @GetMapping("/contact")
    public String contactPage() {
        return "contact";
    }

}
