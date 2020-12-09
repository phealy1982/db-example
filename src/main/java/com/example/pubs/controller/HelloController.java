package com.example.pubs.controller;

import com.example.pubs.model.PubInfo;
import com.example.pubs.repository.PubRepository;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class HelloController {

    private final PubRepository pubRepository;

    public HelloController(PubRepository pubRepository) {
        this.pubRepository = pubRepository;
    }

    @GetMapping("/pubs")
    public List<PubInfo> getPubs() {
        return pubRepository.findAll();
    }

    @PostMapping("/pubs")
    public PubInfo addPub(@RequestBody PubInfo pub) {
        return pubRepository.save(pub);
    }
}
