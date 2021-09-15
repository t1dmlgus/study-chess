package com.study.chess.domain.piece;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;


public class Pawn extends Piece{

    public Pawn(char name, Position position, char team) {
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
    
    
    // 위치교환
}
