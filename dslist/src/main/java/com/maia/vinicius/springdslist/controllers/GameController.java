package com.maia.vinicius.springdslist.controllers;

import com.maia.vinicius.springdslist.dto.GameMinDTO;
import com.maia.vinicius.springdslist.entities.Game;
import com.maia.vinicius.springdslist.services.GameService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.Mapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/games")
public class GameController {

    @Autowired
    private GameService gameService;

    @GetMapping("")
    public List<GameMinDTO> findAll(){
        return gameService.findAll();
    }

}
