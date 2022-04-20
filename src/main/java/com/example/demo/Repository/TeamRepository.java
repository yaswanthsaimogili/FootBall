package com.example.demo.Repository;

import org.springframework.data.jpa.repository.JpaRepository;


import com.example.demo.Entity.Team;

public interface TeamRepository extends JpaRepository<Team, Integer>{
	Team findByTeamId(int id);
	Team findByTeamName(String k);

}
