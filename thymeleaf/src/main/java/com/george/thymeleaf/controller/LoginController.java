package com.george.thymeleaf.controller;

import jakarta.servlet.http.HttpServletRequest;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class LoginController {
    @GetMapping("/login")
    public String login() {
        return "login";
    }

    @PostMapping("/success")
    public String success(HttpServletRequest request, Model model) {
        model.addAttribute("username", request.getParameter("username"));
        model.addAttribute("password", request.getParameter("password"));
        return "success";
    }
}
