package com.devsuperior.dsmovie1.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.devsuperior.dsmovie1.entities.Score;
import com.devsuperior.dsmovie1.entities.ScorePK;

public interface ScoreRepository extends JpaRepository<Score, ScorePK>{

}
