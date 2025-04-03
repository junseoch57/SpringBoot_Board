package com.example.board.entity;


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




}
