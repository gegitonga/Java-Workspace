package com.techfront.votingSystem.controller;

import com.techfront.votingSystem.entity.Candidate;
import com.techfront.votingSystem.entity.Citizen;
import com.techfront.votingSystem.repositories.CandidateRepo;
import com.techfront.votingSystem.repositories.CitizenRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

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
    public String doLogin(@RequestParam String name, Model model){
        Citizen citizen = citizenRepo.findByName(name);
        if(!citizen.getHasvoted()) {
            List<Candidate> candidates = candidateRepo.findAll();
            model.addAttribute("candidates",candidates);
            return "/performVote.html";
        }else {
            return "/alreadyVoted.html";
        }
    }

    @RequestMapping("/voteFor")
    public String voteFor(@RequestParam Integer id){
        Candidate c = candidateRepo.findById((int)id);
        c.setNumberOfVotes(c.getNumberOfVotes() + 1);
        candidateRepo.save(c);

        return "voted.html";
    }
}
