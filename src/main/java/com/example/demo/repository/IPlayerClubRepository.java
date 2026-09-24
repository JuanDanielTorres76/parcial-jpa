package com.example.demo.repository;

import com.example.demo.model.PlayerClub;
import com.example.demo.model.PlayerClubId;

import main.java.com.example.demo.model.Player;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

public interface IPlayerClubRepository extends JpaRepository<PlayerClub, PlayerClubId> {

    List<Player> findDistinctByPlayerClubsClubName(String clubName);

}