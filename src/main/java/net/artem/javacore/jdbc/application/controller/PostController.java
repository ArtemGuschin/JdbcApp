package net.artem.javacore.jdbc.application.controller;

import net.artem.javacore.jdbc.application.repository.gdbc.GdbcPostrepositoryImpl;
import net.artem.javacore.jdbc.application.repository.gdbc.PostRepository;

public class PostController {
    private final PostRepository postRepository;


    public PostController() {
        this.postRepository = new GdbcPostrepositoryImpl();
    }

    public PostController(PostRepository postRepository) {
        this.postRepository = postRepository;
    }
}
