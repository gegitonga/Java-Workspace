package com.techfront.votingSystem.controller;

import com.techfront.votingSystem.entity.Citizen;
import com.techfront.votingSystem.repositories.CandidateRepo;
import com.techfront.votingSystem.repositories.CitizenRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Index {

    @Autowired
    CitizenRepo citizenRepo;

    @RequestMapping("/doAction")
    public String doAction(){
        Citizen citizen = new Citizen((long)2, "bob");
        citizenRepo.save(citizen);



        return "Success";
    }
}
