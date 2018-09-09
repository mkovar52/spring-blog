package com.blog.blog.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class TaxController {

    @GetMapping("/tax")
    public String taxHome(){
        return "taxes/index";
    }

    @GetMapping("/taxes/results")
    public String results(){
        return "/taxes/results";
    }

    @PostMapping("/taxes/results")
    public String resultsPost(){
        return "taxes/results";
    }


}
