package kr.ac.gachon.gc.gachonclub_back.Service;

import kr.ac.gachon.gc.gachonclub_back.Domain.Club;

import java.util.List;

public interface ClubService {
    List<Club> findAll(String range);
    Club findById(Long clubId);
    Club addClub(Club club);
    Club editClub(Club club);
    boolean deleteById(Long clubId);
}
