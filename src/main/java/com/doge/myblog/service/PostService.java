package com.doge.myblog.service;

import com.doge.myblog.model.Post;

import java.util.List;

public interface PostService {

    Post addPost(Post post) throws Exception;
    List<Post> getPost();
}
