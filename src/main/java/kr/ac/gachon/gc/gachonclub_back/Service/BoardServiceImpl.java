package kr.ac.gachon.gc.gachonclub_back.Service;

import kr.ac.gachon.gc.gachonclub_back.Domain.Board;
import kr.ac.gachon.gc.gachonclub_back.Repository.BoardRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.time.LocalDateTime;
import java.util.List;
import java.util.Optional;

@Service
public class BoardServiceImpl implements BoardService{

    @Autowired
    private BoardRepository boardRepository;

    @Override
    public List<Board> findAll(String club) {
        return this.boardRepository.findByClub(club);
    }

    @Override
    public Board findById(Long boardId) {
        return this.boardRepository.findById(boardId).orElse(null);
    }

    @Override
    public Board addBoard(Board board) {
        return this.boardRepository.save(board);
    }

    @Override
    public Board editBoard(Board board) {
        return this.boardRepository.findById(board.get_id())
                .map(p -> {
                    p.setTitle(Optional.ofNullable(board.getTitle()).orElse(p.getTitle()));
                    p.setContent(Optional.ofNullable(board.getContent()).orElse(p.getContent()));

                    return this.boardRepository.save(p);
                })
                .orElse(null);
    }

    @Override
    public boolean deleteById(Long boardId) {
        Board found = this.boardRepository.findById(boardId).orElse(null);
        if(found != null){
            boardRepository.deleteById(found.get_id());
            return true;
        }
        return false;
    }
}