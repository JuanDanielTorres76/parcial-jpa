package com.example.demo.repository;

import com.example.demo.model.Club;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

public interface IClubRepository extends JpaRepository<Club, Long> {

    List<Club> findDistinctByPlayerClubsPlayerCountryHomeMatchesIdOrPlayerClubsPlayerCountryAwayMatchesId(Long homeMatchId, Long awayMatchId);
    
}