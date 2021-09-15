package com.study.chess.domain.board;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import java.awt.print.Book;

import static org.assertj.core.api.Assertions.*;
import static org.junit.jupiter.api.Assertions.*;


class BoardTest {

    @DisplayName("보드 생성")
    @Test
    public void createBoard() throws Exception{
        //given
        Board board = new Board();

        //when
        board.init();
        //then
        assertThat(board).isNotNull();
    }



    @DisplayName("Board에서 1,5의 위치가 King이 맞는지 테스트")
    @Test
    public void testFindKingPiece() throws Exception{
        //given
        Board board = new Board();

        //when
        board.init();

        
        //then
        //assertThat(Board.board)

    }



}