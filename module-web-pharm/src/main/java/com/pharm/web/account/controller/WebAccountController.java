package com.pharm.web.account.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;


@RequestMapping(value = "/account")
@Controller
public class WebAccountController {


    @RequestMapping(value = "/login", method = RequestMethod.GET)
    public String login(Model model) throws Exception {
        
        model.addAttribute("name", "jaehoon.park");
        return "account/login";
    }
}