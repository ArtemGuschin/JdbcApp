package net.artem.javacore.jdbc.application.repository.gdbc;

import net.artem.javacore.jdbc.application.model.Post;

import java.util.List;

public class GdbcPostrepositoryImpl implements PostRepository {
    static final String JDBC_DRIVER = "com.mysql.cj.jdbc.Driver";
    static final String DATABASE_URL = "jdbc:mysql://localhost/proselyte_tutorials";

    static final String USER = "root";
    static final String PASSWORD = "root";

    @Override
    public Post getById(Long aLong) {
        return null;
    }

    @Override
    public List<Post> getAll() {
        return null;
    }

    @Override
    public Post save(Post post) {
        return null;
    }

    @Override
    public Post update(Post post) {
        return null;
    }

    @Override
    public void deleteById(Long aLong) {

    }
}
