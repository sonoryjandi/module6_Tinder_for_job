package ru.amalysheva.module6_tinder_for_job.entity;

import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Table(name = "vacancy")
public class Vacancy extends Questionnaire {
    private String companyLink;
}
