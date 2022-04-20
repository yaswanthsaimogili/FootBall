package com.example.demo.Repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.demo.Entity.Player;

public interface PlayerRepository extends JpaRepository<Player, Integer> {

}
