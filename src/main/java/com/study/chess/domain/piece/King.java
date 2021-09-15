package com.study.chess.domain.piece;


import lombok.Data;
import lombok.EqualsAndHashCode;


public class King extends Piece {

    public King(char name, Position position, char team) {
        super(name, position, team);
    }

    @Override
    public void move() {
        super.move();
    }

    @Override
    public void pick() {
        super.pick();
    }




}
