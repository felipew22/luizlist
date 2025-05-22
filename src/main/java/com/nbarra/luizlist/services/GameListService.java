package com.nbarra.luizlist.services;


import com.nbarra.luizlist.entities.GameList;
import com.nbarra.luizlist.entities.dto.GameListDTO;
import com.nbarra.luizlist.repositeries.GameListReposetory;
import com.nbarra.luizlist.repositeries.GameReposetory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;


@Service
public class GameListService {

    @Autowired
    private GameListReposetory gameListReposetory;

    @Transactional(readOnly = true)
    public List<GameListDTO> findAll() {
        List<GameList> result = gameListReposetory.findAll();
        return result.stream().map(x-> new GameListDTO(x)).toList();


    }
}
