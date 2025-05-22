package com.nbarra.luizlist.repositeries;



import com.nbarra.luizlist.entities.GameList;
import org.springframework.data.jpa.repository.JpaRepository;

public interface GameListReposetory extends JpaRepository<GameList, Long> {
}
