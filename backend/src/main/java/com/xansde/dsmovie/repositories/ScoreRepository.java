package com.xansde.dsmovie.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.xansde.dsmovie.entities.Score;
import com.xansde.dsmovie.entities.ScorePK;

public interface ScoreRepository extends JpaRepository<Score, ScorePK>{
	
	
}
