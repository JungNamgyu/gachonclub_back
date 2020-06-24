package kr.ac.gachon.gc.gachonclub_back.Controller;

import kr.ac.gachon.gc.gachonclub_back.Domain.Club;
import kr.ac.gachon.gc.gachonclub_back.Service.ClubService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class ClubController {

    @Autowired
    ClubService clubService;

    @GetMapping("/club/getAll/{range}")
    public List getAllClub(@PathVariable String range){
        return this.clubService.findAll(range);
    }

    @GetMapping("/club/get/{id}")
    public Club getClub(@PathVariable Long id){
        return this.clubService.findById(id);
    }

    @PostMapping("/club/add")
    public Club addClub(@RequestBody Club club){
        return this.clubService.addClub(club);
    }

    @PutMapping("/club/edit")
    public Club modifyClub(@RequestBody Club club){
        return this.clubService.editClub(club);
    }

    @DeleteMapping("/club/delete/{id}")
    public boolean deleteClub(@PathVariable Long id){
        return this.clubService.deleteById(id);
    }
}
