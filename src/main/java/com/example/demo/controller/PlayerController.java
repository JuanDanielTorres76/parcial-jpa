package com.example.demo.controller;

import com.example.demo.model.Player;
import com.example.demo.repository.IPlayerRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

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

}