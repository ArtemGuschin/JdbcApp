package net.artem.javacore.jdbc.application.model;

import lombok.*;

import net.artem.javacore.jdbc.application.enums.LabelStatus;


@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor

public class Label {
    private Long id;
    private String name;
    private LabelStatus labelStatus;

    public Label(long id, String name, LabelStatus labelStatus) {
        this.id = id;
        this.name = name;
        this.labelStatus = labelStatus;
    }


    public Label(String name, LabelStatus labelStatus) {

    }
}
