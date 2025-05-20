package com.maia.vinicius.springdslist.repositories;

import com.maia.vinicius.springdslist.entities.Game;
import org.springframework.data.jpa.repository.JpaRepository;

public interface GameRepository extends JpaRepository<Game, Long> {

}
