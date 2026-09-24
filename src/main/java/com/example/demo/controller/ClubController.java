package com.example.demo.controller;

import com.example.demo.model.Club;
import com.example.demo.repository.IClubRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/clubs")
@RequiredArgsConstructor
public class ClubController {

    private final IClubRepository clubRepository;

    @GetMapping
    public List<Club> findAll() {
        return clubRepository.findAll();
    }
}