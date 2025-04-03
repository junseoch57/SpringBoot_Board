package com.example.board.dto;

// DTO(Data Transfer Object)
// 데이터를 전송할 때 사용하는 객체

import lombok.*;

import java.time.LocalDateTime;


@Getter  // 각각에 대해 get 메서드를 만들어줌
@Setter  // 각각에 대해 set 메서드를 만들어줌
@ToString
@NoArgsConstructor // 기본 생성자
@AllArgsConstructor // 모든 필드를 매개변수로 하는 생성자
public class BoardDTO {

    private Long id;
    private String boardWriter;
    private String boardPass;
    private String boardTitle;
    private String boardContents;
    private int boardHits;  // 게시글 조회수
    private LocalDateTime boardCreatedTime;  // 작성시간
    private LocalDateTime boardUpdatedTime;  // 수정시간

    // 필드 정의




}
