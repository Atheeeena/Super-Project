package com.approject.tutorial;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class UserController {

    @GetMapping("/pages/signuptrue.html")
    public ModelAndView userAndPass(@RequestParam(required = false) String user, @RequestParam(required = false) String pass, Model model) {
        System.out.println(user + pass);
        ModelAndView mav = new ModelAndView("signuptrue");
        mav.addObject(user, pass);
        return mav;
    }
}