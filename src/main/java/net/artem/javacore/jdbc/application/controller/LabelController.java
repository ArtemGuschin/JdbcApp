package net.artem.javacore.jdbc.application.controller;

import net.artem.javacore.jdbc.application.enums.LabelStatus;
import net.artem.javacore.jdbc.application.model.Label;
import net.artem.javacore.jdbc.application.repository.jdbc.JdbcLabelRepositoryImpl;
import net.artem.javacore.jdbc.application.repository.jdbc.LabelRepository;

public class LabelController {
    private final LabelRepository labelRepository;

    public LabelController(LabelRepository labelRepository) {
        this.labelRepository = labelRepository;
    }

    public LabelController() {
        this.labelRepository = new JdbcLabelRepositoryImpl();

    }




}
