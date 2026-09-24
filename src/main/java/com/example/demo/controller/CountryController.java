package com.example.demo.controller;

import com.example.demo.model.Country;
import com.example.demo.repository.ICountryRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/countries")
@RequiredArgsConstructor
public class CountryController {

    private final ICountryRepository countryRepository;

    @GetMapping
    public List<Country> findAll() {
        return countryRepository.findAll();
    }
}