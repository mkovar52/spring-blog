package com.blog.blog.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

@Controller
public class PetController {

    //will eventually need to add petsvc here


    @GetMapping("/pets")
    public String petsHome(){
        return "/pets/index";
    }

    @GetMapping("/pets/{petId}")
    public String showPet(@PathVariable long petId, Model vModel){
        vModel.addAttribute("id", petId);

        return "pets/show";
    }

    // register new pet to attend daycare
    @GetMapping("/pets/register")
    public String registerNewPet(){
        return "pets/register";
    }

}
