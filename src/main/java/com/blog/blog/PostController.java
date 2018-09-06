package com.blog.blog;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@Controller
public class PostController extends Post {

    //default constructor
    public PostController(){

    }


    @RequestMapping("/posts")
    public String index(Model vModel){

        List<Post> posts = new ArrayList();

        Post post1 = new Post("looking for..", "new job in the tech field");
        Post post2 = new Post("Howdy", "I\'m from Texas, but like snowboarding");
        Post post3 = new Post("Java Devs Wanted", "Apply now!");

        posts.add(post1);
        posts.add(post2);
        posts.add(post3);
        posts.add(new Post("test title", "lorem ipsum lorem ipsumlorem ipsum lorem ipsum lorem ipsum"));

        vModel.addAttribute("posts", posts);

        return "posts/index";
    }

    @RequestMapping("/post/{id}")
    public String show(@PathVariable long id, Model vModel){

        Post post = new Post("hello", "to the world wide web");

        vModel.addAttribute("post", post);
        vModel.addAttribute("id", id);

        return "posts/show";
    }


    @RequestMapping(path = "/posts/create", method = RequestMethod.GET)
    @ResponseBody
    public String createNewPost(){
        return "create a new post";
    }

    @PostMapping("/posts/create")
    @ResponseBody
    public String postCreateForm(){
        return "view the form for creating a post";
    }


}
