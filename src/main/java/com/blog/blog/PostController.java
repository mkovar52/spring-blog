package com.blog.blog;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@Controller
public class PostController extends Post {

    @RequestMapping("/posts")
    public String postIndex(Model vModel){

        List<Post> posts = new ArrayList();

        Post post1 = new Post("looking for..", "new job in the tech field");
        Post post2 = new Post("Howdy", "I\'m from Texas, but like snowboarding");

        posts.add(post1);
        posts.add(post2);

        vModel.addAttribute("listOfPosts", posts);

        return "posts/index";
    }

    @RequestMapping("/post/{id}")
    public String individualPost(@PathVariable long id, Model vModel){

        Post newPost = new Post("hello", "to the world wide web");
        String postTitle = newPost.getTitle();
        String postBody = newPost.getBody();

        vModel.addAttribute("postTitle", postTitle);
        vModel.addAttribute("postBody", postBody);
        vModel.addAttribute("newPost", newPost);
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
