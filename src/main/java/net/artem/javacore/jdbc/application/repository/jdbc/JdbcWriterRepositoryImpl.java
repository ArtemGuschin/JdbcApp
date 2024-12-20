package net.artem.javacore.jdbc.application.repository.jdbc;

import net.artem.javacore.jdbc.application.model.Writer;

import java.util.List;

public class JdbcWriterRepositoryImpl implements WriterRepository {

    static final String JDBC_DRIVER = "com.mysql.cj.jdbc.Driver";
    static final String DATABASE_URL = "jdbc:mysql://localhost/proselyte_tutorials";

    static final String USER = "root";
    static final String PASSWORD = "root";

    @Override
    public Writer getById(Long aLong) {
        return null;
    }

    @Override
    public List<Writer> getAll() {
        return null;
    }

    @Override
    public Writer save(Writer writer) {
        return null;
    }

    @Override
    public Writer update(Writer writer) {
        return null;
    }

    @Override
    public void deleteById(Long aLong) {

    }
}
