package net.artem.javacore.jdbc.application.repository.gdbc;

import net.artem.javacore.jdbc.application.model.Label;

import java.util.List;

public class GdbcLabelRepositoryImpl implements LabelRepository {

    static final String JDBC_DRIVER = "com.mysql.cj.jdbc.Driver";
    static final String DATABASE_URL = "jdbc:mysql://localhost/proselyte_tutorials";

    static final String USER = "root";
    static final String PASSWORD = "root";

    @Override
    public Label getById(Long aLong) {
        return null;
    }

    @Override
    public List<Label> getAll() {
        return null;
    }

    @Override
    public Label save(Label label) {
        return null;
    }

    @Override
    public Label update(Label label) {
        return null;
    }

    @Override
    public void deleteById(Long aLong) {

    }
}
