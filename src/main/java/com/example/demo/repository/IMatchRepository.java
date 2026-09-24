package com.example.demo.repository;

import com.example.demo.model.Match;
import org.springframework.data.jpa.repository.JpaRepository;
import java.util.List;

public interface IMatchRepository extends JpaRepository<Match, Long> {

    List<Match> findDistinctByHomeCountryPlayersPlayerClubsClubNameAndHomeCountryPlayersPlayerClubsEndDateIsNull(String clubName);

}