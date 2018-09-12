package com.blog.blog.controllers;

import com.blog.blog.models.Post;
import com.blog.blog.models.User;
import com.blog.blog.repositories.PostRepository;
import com.blog.blog.repositories.UserRepo;
import com.blog.blog.services.PostService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

@Controller
public class PostController {

    // ensures no one overrides this
    private final PostService postsSvc;
    private final UserRepo userDao;


    //default constructor (added posts service to params
    // dependency injection
    public PostController(PostService postsSvc, UserRepo userDao){
        this.postsSvc = postsSvc;
        this.userDao = userDao;
    }

    // services ex. 9-7-18
    @GetMapping("/posts/{id}")
    public String show(@PathVariable long id, Model viewModel){
        viewModel.addAttribute("post", postsSvc.findOne(id));
        return "/posts/show";
    }


    @GetMapping("/posts")
    public String index(Model viewModel, @ModelAttribute User user){
        viewModel.addAttribute("posts", postsSvc.findAll());
        viewModel.addAttribute("user", user);

        return "/posts/index";
    }

    // =======
//    @PostMapping("/posts/delete")
//    public String deletePostFromRecords(@ModelAttribute Post post){
//        postsSvc.delete(post);
//        return "redirect:/posts";
//    }

    @GetMapping("/posts/create")
    public String showCreateForm(){
        return "/posts/create";
    }

// ===== first version of passing form data from view to controller ===== \\
//    @PostMapping("posts/save")
//    public String createPost(@RequestParam(name = "title") String title, @RequestParam(name = "body") String body, @RequestParam(name = "user_email") String userEmail) {
//
//        Post post = postsSvc.save(new Post(body, title, userEmail));
//        postsSvc.save(post);
//        return "redirect:/posts";
//    }

//// ===== re-worked version from above to incorporate form binding ===== \\
    @PostMapping("/posts/save")
    public String createPost(@ModelAttribute Post post){
        post.setUser(userDao.findOne(3L));
        postsSvc.save(post);

        return "redirect:/posts";
    }

    @GetMapping("/posts/{id}/edit")
    public String editPost(@PathVariable long id, Model viewModel){
        viewModel.addAttribute("post", postsSvc.findOne(id));
        return "posts/edit";
    }

    @PostMapping("/posts/{id}/edit")
    public String updatePost(@ModelAttribute Post post){
        postsSvc.save(post);
        return "redirect:/posts";
    }

    @PostMapping("/posts/delete")
    public String deletePostById(@RequestParam(name = "id") long id){
        postsSvc.delete(id);
        return "redirect:/posts";
    }

}
