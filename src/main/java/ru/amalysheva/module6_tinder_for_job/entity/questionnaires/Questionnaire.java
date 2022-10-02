package ru.amalysheva.module6_tinder_for_job.entity;

import javax.persistence.*;
import java.util.List;

@MappedSuperclass
public abstract class Questionnaire {
    @Id
    @GeneratedValue
    private Long id;

    private JobTitle jobTitle;

    private String education;

    //todo
    @ManyToMany
    @Enumerated(EnumType.STRING)
    private List<Skills> skillsList;
    
    private String experience;
}
