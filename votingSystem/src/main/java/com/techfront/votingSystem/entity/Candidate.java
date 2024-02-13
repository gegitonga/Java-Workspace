package com.techfront.votingSystem.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name="candidates")
public class Candidate {

    public Candidate(){
        super();
    }
    public Candidate(Long id, String name,Integer numberOfVotes){
        super();
        this.id =id;
        this.name =name;
        this.numberOfVotes = numberOfVotes;
    }
    @Id
    @Column
    private Long id;

    @Column(name = "candidate_name")
    private String name;

    @Column(name="numberOfVotes")
    private Integer numberOfVotes;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getNumberOfVotes() {
        return numberOfVotes;
    }

    public void setNumberOfVotes(Integer numberOfVotes) {
        this.numberOfVotes = numberOfVotes;
    }
}
