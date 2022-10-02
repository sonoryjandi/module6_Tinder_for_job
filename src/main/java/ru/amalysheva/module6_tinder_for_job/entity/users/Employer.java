package ru.amalysheva.module6_tinder_for_job.entity;

import javax.persistence.Entity;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import java.util.List;

@Entity
@Table(name = "employer")
public class Employer extends User{
    private String companyName;

    @OneToMany
    private List<Vacancy> vacancyList;
}
