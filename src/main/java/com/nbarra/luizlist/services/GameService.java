package com.nbarra.luizlist.services;


import com.nbarra.luizlist.entities.Game;
import com.nbarra.luizlist.entities.dto.GameAllDTO;
import com.nbarra.luizlist.entities.dto.GameMinDTO;
import com.nbarra.luizlist.projections.GameMinProjection;
import com.nbarra.luizlist.repositeries.GameReposetory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;


@Service
public class GameService {

    @Autowired
    private GameReposetory gameReposetory;

    @Transactional(readOnly = true)
    public GameAllDTO findById(Long id) {
        Game result = gameReposetory.findById(id).get();
        GameAllDTO gameAllDTO = new GameAllDTO(result);
        return gameAllDTO;
    }



    @Transactional(readOnly = true)
    public List<GameMinDTO> findAll() {
        List<Game> result = gameReposetory.findAll();
        List<GameMinDTO> dto = result.stream().map(x-> new GameMinDTO(x)).toList();
        return dto;
    }

    @Transactional(readOnly = true)
    public List<GameMinDTO> findByList(Long listId) {
        List<GameMinProjection> result = gameReposetory.searchByList(listId);
        List<GameMinDTO> dto = result.stream().map(x-> new GameMinDTO(x)).toList();
        return dto;
    }
}
