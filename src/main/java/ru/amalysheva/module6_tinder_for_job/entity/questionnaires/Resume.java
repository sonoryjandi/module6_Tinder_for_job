package ru.amalysheva.module6_tinder_for_job.entity;

import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Table(name = "resume")
public class Resume extends Questionnaire {
    private String candidateLink;
}