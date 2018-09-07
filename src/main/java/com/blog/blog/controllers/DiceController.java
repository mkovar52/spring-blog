package com.blog.blog.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;


import java.util.Random;

@Controller
public class DiceController {

    @GetMapping("/roll-dice")
    public String returnWelcomePage(){
        return "dice";
    }

    @GetMapping(path = "/roll-dice/{n}")
    public String returnResultPage(@PathVariable int n, Model vModel) {


        Random randNum = new Random();
        int randNumInt = (randNum.nextInt((6 - 1) + 1) +1);

        vModel.addAttribute("n", n);
        vModel.addAttribute("randNumInt", randNumInt);

        if (n == randNumInt) {
            vModel.addAttribute("guess", "correct");
        } else if (n > randNumInt) {
            vModel.addAttribute("guess", "high");
        } else {
            vModel.addAttribute("guess", "low");
        }

            return "result";
    }

}
