package com.blog.blog;


import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class HomeController {

    @GetMapping("/")
    @ResponseBody
    public String hello(){
        return "This is the landing page!";
    }

    @GetMapping("/hello/{name}")
    public String welcome(@PathVariable String name, Model vModel){
        vModel.addAttribute("name", name);
        vModel.addAttribute("role", "admin");

        return "home";
    }

}
