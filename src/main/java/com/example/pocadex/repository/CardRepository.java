package com.example.pocadex.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.pocadex.model.Card;


@Repository
public interface CardRepository extends JpaRepository<Card, Long> {

}
