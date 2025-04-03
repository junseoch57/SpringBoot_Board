package com.example.board.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/board")  // board로 시작하는 주소를 컨트롤러가 받음
public class BoardController {
    @GetMapping("/save")   // 매핑 값이 일치하는 메서드가 호출
    public String saveForm(){
        return "save";
    }


}
