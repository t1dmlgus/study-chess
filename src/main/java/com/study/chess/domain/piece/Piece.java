package com.study.chess.domain.piece;


import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Piece {

    // 역할
    private char name;
    // 위치
    private Position position;
    // 팀
    private char team;

    public Piece(Position position, char team) {
        this.position = position;
        this.team = team;
    }

    // 이동
    public void move() {
    }

    // 잡는다
    public void pick() {
    }

}
