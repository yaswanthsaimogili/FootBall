package com.example.demo.Repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.demo.Entity.Venue;

public interface VenueRepository extends JpaRepository<Venue, Integer> {

}
