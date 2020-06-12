package kr.ac.gachon.gc.gachonclub_back.Domain;

import lombok.Data;
import lombok.NoArgsConstructor;
import org.hibernate.annotations.Type;

import javax.persistence.*;
import java.util.Date;

@Entity
@Data
@NoArgsConstructor
public class Board {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long _id;

    // 게시판 제목
    @Column(nullable = false)
    private String title;

    // 게시판 내용
    @Column(nullable = false)
    @Type(type="text")
    private String content;

    // 게시판 글쓴이
    @Column(nullable = false)
    private String name;

    // 게시판 날짜
    @Column(nullable = false)
    private Date date;
}
