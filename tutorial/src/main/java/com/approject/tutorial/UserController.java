package com.approject.tutorial;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class UserController {

    @GetMapping("/signup")
    public String userAndPass(@RequestParam(name="user", required=false, defaultValue="World") String name, @RequestParam(name="pass", required=false, defaultValue="World") String password,Model model) {
        model.addAttribute("name", name);
        model.addAttribute("password", password);
        return "signup";
    }

}