package net.artem.javacore.jdbc.application.controller;

import net.artem.javacore.jdbc.application.repository.gdbc.GdbcWriterRepositoryImpl;
import net.artem.javacore.jdbc.application.repository.gdbc.WriterRepository;

public class WriterController {
    private final WriterRepository writerRepository;

    public WriterController(WriterRepository writerRepository) {
        this.writerRepository = writerRepository;
    }

    public WriterController() {

        this.writerRepository = new GdbcWriterRepositoryImpl() ;
    }

}
