package com.example.board.controller;

import com.example.board.dto.BoardDTO;
import com.example.board.service.BoardService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

@Controller
@RequiredArgsConstructor
@RequestMapping("/board")  // board로 시작하는 주소를 컨트롤러가 받음
public class BoardController {
    private final BoardService boardService; // 생성자 주입방식으로 의존성 주입받음

    @GetMapping("/save")   // 매핑 값이 일치하는 메서드가 호출
    public String saveForm(){
        return "save";
    }

    @PostMapping("/save")   // save파일에서 POST로 보냈기 때문
    public String save(@ModelAttribute BoardDTO boardDTO){
                        // save.html , DTO의 필드값 이름이 같을 때
                        // 간단하게 입력값을 가져올 수 있음
        System.out.println("boardDTO = " + boardDTO);
        boardService.save(boardDTO);  // boardService의 save라는 메서드 호출

        return null;
    }

}
