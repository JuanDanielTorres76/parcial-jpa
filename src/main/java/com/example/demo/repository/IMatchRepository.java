package com.example.demo.repository;

import com.example.demo.model.Match;
import org.springframework.data.jpa.repository.JpaRepository;

public interface IMatchRepository extends JpaRepository<Match, Long> {
}