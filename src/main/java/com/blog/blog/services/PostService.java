package com.blog.blog.services;

import com.blog.blog.Post;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class PostService {

    private List<Post> posts;

    public PostService(){
        posts = new ArrayList<>();
        createPosts();
    }

    public Post save(Post post){
        //adjusts ids for posts start at 1 instead of 0.
        post.setPostId(posts.size() + 1);
        posts.add(post);
        return post;
    }

    public Post findOne(long postId){
        //casting & parsing would work, but this is casting. less steps b/c parsing converts from string.
        return posts.get((int) postId - 1);
    }

    public List<Post> findAll(){
        return posts;
    }


    // dummy data (that used to be in the controller
    private void createPosts(){
        this.save(new Post("hello", "worldx5"));
        this.save(new Post("how to", "play paintball"));
        this.save(new Post("Hello, My name is", "Not World."));
        this.save(new Post("Learn How To Snowboard", "At the world's best resorts"));
        this.save(new Post("Favorite Ski Resorts", "Breck, Keystone, Whistler, Park City"));

    }



}
