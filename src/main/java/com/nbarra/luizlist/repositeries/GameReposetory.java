package com.nbarra.luizlist.repositeries;


import com.nbarra.luizlist.entities.Game;
import org.springframework.data.jpa.repository.JpaRepository;

public interface GameReposetory extends JpaRepository<Game, Long> {
}
