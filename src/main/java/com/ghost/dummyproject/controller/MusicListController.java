package com.ghost.dummyproject.controller;

import com.ghost.dummyproject.model.Warrior;
import org.springframework.web.bind.annotation.*;

import java.util.List;

// @RestController to start making APIs
@RestController
public class MusicListController {

    @RequestMapping(value = "/api/musiclist", method = RequestMethod.GET)
    public Warrior getMusicList(@RequestParam(value = "myid", required = false) String a){

        Warrior warrior = new Warrior("joe", 10,10,10,10,10,10,10);
        return warrior;
    }

    @RequestMapping(value = "/api/addMusic", method = RequestMethod.POST)
    public String postAddMusic(String a, String music){
        return a + music;
    }
}
