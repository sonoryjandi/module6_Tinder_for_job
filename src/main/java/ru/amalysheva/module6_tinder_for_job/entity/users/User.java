package ru.amalysheva.module6_tinder_for_job.entity;

import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.MappedSuperclass;

@MappedSuperclass //Обозначает класс, информация о сопоставлении которого применяется к сущностям, которые наследуются от него.
public abstract class User {
    @Id
    @GeneratedValue
    private Long id;

    private UserStatus userStatus;

    //region set-get
    public void setId(Long id) {
        this.id = id;
    }

    public Long getId() {
        return id;
    }
    //endregion
}
