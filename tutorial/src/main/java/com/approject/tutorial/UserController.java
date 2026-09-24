package com.approject.tutorial;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class UserController {

    @GetMapping("/pages/signuptrue.html")
    @ResponseBody
    public void userAndPass(@RequestParam(required = false) String user, @RequestParam(required = false) String pass) {
        System.out.println("Username: " + user + "\nPassword: " + pass);
    }

}