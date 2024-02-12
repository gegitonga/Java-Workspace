package com.techfront.votingSystem.controller;

import com.techfront.votingSystem.entity.Citizen;
import com.techfront.votingSystem.repositories.CandidateRepo;
import com.techfront.votingSystem.repositories.CitizenRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@Controller
public class VotingController {

    @Autowired
    CitizenRepo citizenRepo;

    @Autowired
    CandidateRepo candidateRepo;

    @RequestMapping("/")
    public String gotToVote(){
        return "vote.html";
    }

    @RequestMapping("/dologin")
    public String doLogin(@RequestParam String name){
        Citizen citizen = citizenRepo.findByName(name);
        if(!citizen.getHasvoted())
          return "/performVote.html";
        else
            return "/alreadyVoted.html";
    }
}
