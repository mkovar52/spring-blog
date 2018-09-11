package com.blog.blog.repositories;

import com.blog.blog.models.Post;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface PostRepository extends CrudRepository<Post, Long> {

    List<Post> findAll();

    @Query("from Post p where p.id=?1")
    Post findByPostId(long postId);

}
