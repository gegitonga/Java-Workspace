package com.techfront.votingSystem.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name="citizens")
public class Citizen {

    public Citizen(){
        super();
    }
    public Citizen(Long id, String name){
        super();
        this.id = id;
        this.name = name;
    }
    @Id
    @Column(name="id")
    private Long id;

    @Column(name="citizen_name")
    private String name;

    @Column(name = "hasvoted")
    private Boolean hasvoted;

    public Long getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Boolean getHasvoted() {
        return hasvoted;
    }

    public void setHasvoted(Boolean hasvoted) {
        this.hasvoted = hasvoted;
    }
}
