package com.nbarra.luizlist.services;


import com.nbarra.luizlist.entities.Game;
import com.nbarra.luizlist.entities.dto.GameMinDTO;
import com.nbarra.luizlist.repositeries.GameReposetory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;


@Service
public class GameService {

    @Autowired
    private GameReposetory gameReposetory;

    public List<GameMinDTO> findAll() {
        List<Game> result = gameReposetory.findAll();
        List<GameMinDTO> dto = result.stream().map(x-> new GameMinDTO(x)).toList();
        return dto;

    }
}
