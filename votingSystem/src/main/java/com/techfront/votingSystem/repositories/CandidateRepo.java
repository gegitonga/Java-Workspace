package com.techfront.votingSystem.repositories;

import com.techfront.votingSystem.entity.Candidate;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CandidateRepo extends JpaRepository<Candidate,Integer> {
}
