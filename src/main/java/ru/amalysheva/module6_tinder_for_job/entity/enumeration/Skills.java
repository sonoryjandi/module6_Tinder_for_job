package ru.amalysheva.module6_tinder_for_job.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
public enum Skills {
    JAVA, PYTHON, UNIT_TESTS, SPRING, GIT, GITHUB, GITLAB, SQL;

    private Long id;
//    private String skillName;

    @Id
    @GeneratedValue
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }
}
