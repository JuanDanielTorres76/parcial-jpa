package com.example.demo.repository;

import com.example.demo.model.Player;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface IPlayerRepository extends JpaRepository<Player, Long> {

    List<Player> findDistinctByPlayerClubsClubName(String clubName);

    List<Player> findDistinctByCountryNameAndPlayerClubsClubName(String countryName, String clubName);

    List<Player> findTop5ByOrderByFifaScoreDesc();

    List<Player> findByFifaScoreGreaterThanEqualOrderByFifaScoreDescCountryNameAsc(Integer minScore);

}