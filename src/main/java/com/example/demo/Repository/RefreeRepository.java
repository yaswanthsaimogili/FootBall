package com.example.demo.Repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.demo.Entity.Refree;


public interface RefreeRepository extends JpaRepository<Refree, Integer> {

	Refree findByrefreeId(int id);
	Refree findByrefreeName(String k);

	
}
