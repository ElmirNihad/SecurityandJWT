package org.example.security.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class usercontroller {

    @GetMapping("/deep")
    public String deep(){
        return "Deep Page";
    }

    @GetMapping(path = "/index")
    public String index(){
        return "Welcome My Webpage !";
    }

    @GetMapping(path = "/dashboard")
    public String dashboard(){
        return "Welcome My Dashboard !";
    }
}
