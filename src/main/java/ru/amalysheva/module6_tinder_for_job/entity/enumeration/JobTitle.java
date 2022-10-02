package ru.amalysheva.module6_tinder_for_job.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

//@Entity
public enum JobTitle {
    ANALYST, DEVELOPER, DEVOPS, PROJECT_MANAGER, PRODUCT_MANAGER, QA, DESIGNER;

    @Id
    @GeneratedValue
    private Long id;

    public void setId(Long id) {
        this.id = id;
    }

    public Long getId() {
        return id;
    }
}
