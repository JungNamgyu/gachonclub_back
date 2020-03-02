package kr.ac.gachon.gc.gachonclub_back.Domain;

import lombok.Data;
import lombok.NoArgsConstructor;
import org.hibernate.annotations.Type;

import javax.persistence.*;

@Entity
@Data
@NoArgsConstructor
public class Club {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long _id;

    // 동아리 이름
    @Column(nullable = false)
    private String name;

    // 동아리 소개
    @Column(nullable = false)
    private String info;

    // 동아리 내용
    @Column(nullable = false)
    @Type(type="text")
    private String data;

    // 동아리 내용 사진
    @Column(nullable = false)
    private String data_url;
}
