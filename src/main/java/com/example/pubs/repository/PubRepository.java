package com.example.pubs.repository;

import com.example.pubs.model.PubInfo;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PubRepository extends JpaRepository<PubInfo, Long> {
}
