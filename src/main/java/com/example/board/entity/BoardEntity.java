package com.example.board.entity;


import com.example.board.dto.BoardDTO;
import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

// DB의 테이블 역할을 하는 클래스
// 테이블 객체를 구성
// Spring Data Jpa에서 필수
// DB 작업을 하는 부분
@Entity
@Getter
@Setter
@Table(name = "board_table")
public class BoardEntity {

    @Id // PK 컬럼 지정. 필수로 있어야
    @GeneratedValue(strategy = GenerationType.IDENTITY) // auto_increment
    private Long id;

    // 일반 컬럼
    @Column(length = 20, nullable = false ) // 크기 : 20, not null로 지정함
    private String boardWriter;

    @Column // 디폴트 값 : 크기 255 , null로 지정
    private String boardPass;

    @Column
    private String boardTitle;

    @Column(length = 500)
    private String boardContentes;

    @Column
    private int boardHits;

    public static BoardEntity toSaveEntity(BoardDTO boardDTO){

        // dto에 담긴 값들을 entity객체로 옮겨담음
        BoardEntity boardEntity = new BoardEntity();
        boardEntity.setBoardWriter(boardDTO.getBoardWriter());
        boardEntity.setBoardPass(boardDTO.getBoardPass());
        boardEntity.setBoardTitle(boardDTO.getBoardTitle());
        boardEntity.setBoardContentes(boardDTO.getBoardContents());
        boardEntity.setBoardHits(0);
        return boardEntity;

    }




}
