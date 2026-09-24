package com.example.demo.repository;

import com.example.demo.model.PlayerClub;
import com.example.demo.model.PlayerClubId;
import org.springframework.data.jpa.repository.JpaRepository;

public interface IPlayerClubRepository extends JpaRepository<PlayerClub, PlayerClubId> {
}