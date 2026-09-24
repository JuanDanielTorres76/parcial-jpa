package com.example.demo.controller;

import com.example.demo.model.Match;
import com.example.demo.repository.IMatchRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

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
}