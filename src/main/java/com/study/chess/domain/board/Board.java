package com.study.chess.domain.board;


import com.study.chess.domain.piece.*;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.IntStream;

public class Board {


    public static List<Piece> board = new ArrayList<>();

    // 초기화
    public void init() {

        // 피스(폰)
        createPawn();
        // 흰 피스(간부)
        createWhiteMajor();
        // 블랙 피스(간부)
        createBlackMajor();
        // 빈 피스
        createEmptyPiece();

    }





    private void createEmptyPiece() {
        for (int x = 1; x < 9; x++) {
            for (int y = 3; y < 7; y++) {
                board.add(new Piece('.', new Position(x, y), 'N'));
            }
        }
    }

    private void createBlackMajor() {
        board.add(new Rook('R', new Position(1, 8), 'B'));
        board.add(new Knight('N', new Position(1, 7), 'B'));
        board.add(new Bishop('B', new Position(1, 6), 'B'));
        board.add(new King('K', new Position(1, 5), 'B'));
        board.add(new Queen('Q', new Position(1, 4), 'B'));
        board.add(new Bishop('B', new Position(1, 3), 'B'));
        board.add(new Knight('N', new Position(1, 2), 'B'));
        board.add(new Rook('R', new Position(1, 1), 'B'));
    }

    private void createWhiteMajor() {
        board.add(new Rook('R', new Position(1, 8), 'W'));
        board.add(new Knight('N', new Position(1, 7), 'W'));
        board.add(new Bishop('B', new Position(1, 6), 'W'));
        board.add(new King('K', new Position(1, 5), 'W'));
        board.add(new Queen('Q', new Position(1, 4), 'W'));
        board.add(new Bishop('B', new Position(1, 3), 'W'));
        board.add(new Knight('N', new Position(1, 2), 'W'));
        board.add(new Rook('R', new Position(1, 1), 'W'));
    }

    private void createPawn() {
        for (int i = 1; i < 9; i++) {
            board.add(new Pawn('P',new Position(i, 2), 'W'));
            board.add(new Pawn('P',new Position(i, 7), 'B'));
        }
    }


}
