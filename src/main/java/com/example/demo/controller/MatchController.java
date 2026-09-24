package com.example.demo.controller;

import com.example.demo.model.Match;
import com.example.demo.repository.IMatchRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.List;

@RestController
@RequestMapping("/matches")
@RequiredArgsConstructor
public class MatchController {

    private final IMatchRepository matchRepository;

    @GetMapping
    public List<Match> findAll() {

        return matchRepository.findAll();

    }

    @GetMapping("/home-by-club")
    public List<Match> findHomeMatchesByClub(@RequestParam String club) {

        return matchRepository.findDistinctByHomeCountryPlayersPlayerClubsClubNameAndHomeCountryPlayersPlayerClubsEndDateIsNull(club);

    }
}