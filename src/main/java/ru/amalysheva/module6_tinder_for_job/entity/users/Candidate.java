package ru.amalysheva.module6_tinder_for_job.entity;

import javax.persistence.Entity;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import java.util.List;

@Entity
@Table(name = "candidate")
public class Candidate extends User {
    private String name;

    private Integer age;

    @OneToMany
    private List<Resume> resumeList;
}
