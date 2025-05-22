package com.nbarra.luizlist.controllers;
import com.nbarra.luizlist.entities.Game;
import com.nbarra.luizlist.entities.dto.GameAllDTO;
import com.nbarra.luizlist.entities.dto.GameMinDTO;
import com.nbarra.luizlist.services.GameService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping(value = "/games")
public class GameController {
@Autowired
private GameService gameService;

    @GetMapping(value = "/{id}")
    public GameAllDTO findById(@PathVariable Long id) {
        GameAllDTO result = gameService.findById(id);
        return result;

    }

    @GetMapping
    public List<GameMinDTO> findAll() {
        List<GameMinDTO> result = gameService.findAll();
        return result;
    }
}


