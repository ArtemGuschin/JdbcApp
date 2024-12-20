package net.artem.javacore.jdbc.application.controller;

import net.artem.javacore.jdbc.application.repository.jdbc.JdbcPostRepositoryImpl;
import net.artem.javacore.jdbc.application.repository.jdbc.PostRepository;

public class PostController {
    private final PostRepository postRepository;


    public PostController() {
        this.postRepository = new JdbcPostRepositoryImpl();
    }

    public PostController(PostRepository postRepository) {
        this.postRepository = postRepository;
    }
}
