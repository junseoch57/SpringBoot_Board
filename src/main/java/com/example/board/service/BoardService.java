package com.example.board.service;

import com.example.board.dto.BoardDTO;
import com.example.board.repository.BoardRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

// DTO -> Entity (Entity class에서)
// Entity -> DTO (DTO class에서)


// 컨트롤러에서 넘겨받을 때는 dto로 받음
// repository로 넘겨줄 때는 Entity로 넘겨줌
// DB의 데이터를 조회할 때는 repository로부터 entity로 받음

@Service
@RequiredArgsConstructor
public class BoardService {
    private final BoardRepository boardRepository;


    public void save(BoardDTO boardDTO) {  // save 메서드를 service에 정의


        boardRepository.save();  // save 메서드는 기본적으로 Entity 타입으로
        // save 메서드 호출 -> 그래서 db에 insert 가능함

    }
}
