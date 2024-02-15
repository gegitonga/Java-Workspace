package com.techfront.votingSystem.controller;

import com.techfront.votingSystem.entity.Candidate;
import com.techfront.votingSystem.entity.Citizen;
import com.techfront.votingSystem.repositories.CandidateRepo;
import com.techfront.votingSystem.repositories.CitizenRepo;
import jakarta.servlet.http.HttpSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.jboss.logging.Logger;
import java.util.List;

@Controller
public class VotingController {

    public final Logger logger = Logger.getLogger(VotingController.class);
    @Autowired
    CitizenRepo citizenRepo;

    @Autowired
    CandidateRepo candidateRepo;

    @RequestMapping("/")
    public String gotToVote(){
        logger.info("Returning vote.html file");
        return "vote.html";
    }

    @RequestMapping("/dologin")
    public String doLogin(@RequestParam String name, Model model, HttpSession session){
        logger.info("Getting citizen from database");
        Citizen citizen = citizenRepo.findByName(name);

        session.setAttribute("citizen", citizen);

        if(!citizen.getHasvoted()) {
            List<Candidate> candidates = candidateRepo.findAll();
            model.addAttribute("candidates",candidates);
            return "/performVote.html";
        }else {
            return "/alreadyVoted.html";
        }
    }
    @RequestMapping("/voteFor")
    public String voteFor(@RequestParam Integer id, HttpSession session){
        Citizen c = (Citizen) session.getAttribute("citizen");

        if(!c.getHasvoted()) {
            c.setHasvoted(true);

            Candidate candidate = candidateRepo.findById((int) id);
            candidate.setNumberOfVotes(candidate.getNumberOfVotes() + 1);
            candidateRepo.save(candidate);
            citizenRepo.save(c);
            return "voted.html";
        }
        return "/alreadyVoted.html";
    }
}
