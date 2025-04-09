package com.example.board.repository;

import com.example.board.entity.BoardEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface BoardRepository extends JpaRepository<BoardEntity, Long> {
                                                     // <엔티티클래스 이름, 클래스의 PK 타입>

    // 리포지토리는 기본적으로 엔티티 클래스만 받아준다


}
