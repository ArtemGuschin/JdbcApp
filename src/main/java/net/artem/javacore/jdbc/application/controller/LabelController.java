package net.artem.javacore.jdbc.application.controller;

import net.artem.javacore.jdbc.application.repository.gdbc.GdbcLabelRepositoryImpl;
import net.artem.javacore.jdbc.application.repository.gdbc.LabelRepository;

public class LabelController {
    private final LabelRepository labelRepository;

    public LabelController(LabelRepository labelRepository) {
        this.labelRepository = labelRepository;
    }

    public LabelController() {
        this.labelRepository = new GdbcLabelRepositoryImpl();

    }
}
