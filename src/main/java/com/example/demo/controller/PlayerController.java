package com.example.demo.controller;

import com.example.demo.model.Player;
import com.example.demo.repository.IPlayerRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.List;

@RestController
@RequestMapping("/players")
@RequiredArgsConstructor
public class PlayerController {

    private final IPlayerRepository playerRepository;

    @GetMapping
    public List<Player> findAll() {
        return playerRepository.findAll();
    }

    @GetMapping("/by-club")
    public List<Player> findByClub(@RequestParam String club) {
        return playerRepository.findDistinctByPlayerClubsClubName(club);
    }

    @GetMapping("/by-country-and-club")
    public List<Player> findByCountryAndClub(@RequestParam String country,@RequestParam String club) {

        return playerRepository.findDistinctByCountryNameAndPlayerClubsClubName(country, club);

    }

    @GetMapping("/top-countries")
    public List<String> findTopCountries() {
        
        Integer cutoff = playerRepository.findTop5ByOrderByFifaScoreDesc().get(4).getFifaScore();

        return playerRepository.findByFifaScoreGreaterThanEqualOrderByFifaScoreDescCountryNameAsc(cutoff).stream().map(player -> player.getCountry().getName()).distinct().toList();
    }

}