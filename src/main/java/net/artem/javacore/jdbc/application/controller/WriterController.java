package net.artem.javacore.jdbc.application.controller;

import net.artem.javacore.jdbc.application.repository.jdbc.JdbcWriterRepositoryImpl;
import net.artem.javacore.jdbc.application.repository.jdbc.WriterRepository;

public class WriterController {
    private final WriterRepository writerRepository;

    public WriterController(WriterRepository writerRepository) {
        this.writerRepository = writerRepository;
    }

    public WriterController() {

        this.writerRepository = new JdbcWriterRepositoryImpl() ;
    }

}
