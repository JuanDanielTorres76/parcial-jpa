package com.example.demo.repository;

import com.example.demo.model.Club;
import org.springframework.data.jpa.repository.JpaRepository;

public interface IClubRepository extends JpaRepository<Club, Long> {
}