package com.nbarra.luizlist.entities;

import jakarta.persistence.EmbeddedId;
import jakarta.persistence.Entity;
import jakarta.persistence.Table;

import java.util.Objects;

@Entity
@Table(name = "tb_belonging")

public class belonging {

    @EmbeddedId
    private BelongingPrimarykey id = new BelongingPrimarykey();
    private Integer position;

    public belonging() {
    }

    public belonging(Game game, GameList list , Integer position) {
        this.id.setGame(game);
        this.id.setGameList(list);
        this.position = position;
    }


    public BelongingPrimarykey getId() {
        return id;
    }

    public void setId(BelongingPrimarykey id) {
        this.id = id;
    }

    public Integer getPosition() {
        return position;
    }

    public void setPosition(Integer position) {
        this.position = position;
    }

    @Override
    public boolean equals(Object o) {
        if (!(o instanceof belonging belonging)) return false;
        return Objects.equals(id, belonging.id);
    }

    @Override
    public int hashCode() {
        return Objects.hashCode(id);
    }
}
