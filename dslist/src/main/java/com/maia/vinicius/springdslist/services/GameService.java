package com.maia.vinicius.springdslist.services;

import com.maia.vinicius.springdslist.dto.GameMinDTO;
import com.maia.vinicius.springdslist.entities.Game;
import com.maia.vinicius.springdslist.repositories.GameRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;
import java.util.List;


@Service
public class GameService {

    @Autowired
    private GameRepository gameRepository;

    public List<GameMinDTO> findAll(){
       List<Game> result = gameRepository.findAll();
       List<GameMinDTO> dto = result.stream().map(x -> new GameMinDTO(x)).toList();
        return dto;
    }
}
