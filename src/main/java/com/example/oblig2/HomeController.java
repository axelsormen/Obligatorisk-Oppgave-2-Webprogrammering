package com.example.oblig2;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;
import java.util.ArrayList;
import java.util.List;

@RestController
public class HomeController {

    private final List<Kino> alleBilletter = new ArrayList<>();

    @PostMapping("/lagre")
    public void lagreBillett(Kino innBillett){
        alleBilletter.add(innBillett);
    }

    @GetMapping("/hentAlle")
    public List<Kino> hentAlle(){
        return alleBilletter;
    }

    @GetMapping("/slettAlle")
    public void slettAlle(){
        alleBilletter.clear();
    }
}
