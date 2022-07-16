package com.devsuperior.dsmovie1.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.devsuperior.dsmovie1.entities.Movie;

public interface MovieRepository extends JpaRepository<Movie, Long>{

}
