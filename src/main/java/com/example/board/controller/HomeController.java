package com.example.board.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class HomeController {

    @GetMapping("/")     // 기본 주소 요청
    public String index(){  // 메서드 호출
        return "index";     // index.html을 찾아감

    }

}
