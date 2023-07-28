package com.example.projectx.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class IndexController {
    

    @GetMapping("/")
    public String index(){
       return "index";
    }

    @PostMapping("/formprocess")
    @ResponseBody
    public String formProcess(@RequestParam("email") String email, @RequestParam("password") String password){
 


        if(email.equals("foo@foo.com") && password.equals("foobar")){
            return "confirmation";
        } else {
            return "error: wrong credentials";
        }

    }

}
