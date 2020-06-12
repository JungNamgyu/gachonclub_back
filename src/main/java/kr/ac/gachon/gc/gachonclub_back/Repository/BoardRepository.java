package kr.ac.gachon.gc.gachonclub_back.Repository;

import kr.ac.gachon.gc.gachonclub_back.Domain.Board;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface BoardRepository extends JpaRepository<Board, Long> {
    Optional<Board> findByTitle(String title);
}
