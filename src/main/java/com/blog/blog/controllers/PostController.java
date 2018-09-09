package com.blog.blog.controllers;

import com.blog.blog.Post;
import com.blog.blog.services.PostService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@Controller
public class PostController {

    // ensures no one overrides this
    private final PostService postsSvc;

    //default constructor (added posts service to params
    // dependency injection
    public PostController(PostService postsSvc){
        this.postsSvc = postsSvc;
    }

    // services ex. 9-7-18
    @GetMapping("/posts/{postId}")
    public String showPost(@PathVariable long postId, Model viewModel){
        Post post = postsSvc.findOne(postId);
        viewModel.addAttribute("post", post);

        return "/posts/show";
    }


    @RequestMapping("/posts")
    public String index(Model vModel){

        vModel.addAttribute("posts", postsSvc.findAll());

        return "/posts/index";
    }


    @GetMapping("/posts/create")
    public String showCreateForm(){
        return "/posts/create";
    }

//    @PostMapping("posts/save")
//    public String createPost(@RequestParam(name = "title") String title, @RequestParam(name = "body") String body) {
//
//        Post post = postsSvc.save(new Post(title, body));
//
//        return "redirect:/posts";
//    }

    //re-worked version from above
    @PostMapping("/posts/save")
    public String createPost(@ModelAttribute Post post){
        postsSvc.save(post);
        return "redirect:/posts";
    }

    @GetMapping("/posts/{postId}/edit")
    public String editPost(@PathVariable long postId, Model viewModel){
        viewModel.addAttribute("post", postsSvc.findOne(postId));

        return "/posts/edit";
    }




}
