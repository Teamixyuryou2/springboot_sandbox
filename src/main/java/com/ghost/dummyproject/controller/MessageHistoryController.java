package com.ghost.dummyproject.controller;

import com.ghost.dummyproject.model.MessageHistory;
import com.ghost.dummyproject.repository.MessageHistoryRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
public class MessageHistoryController {
    @Autowired
    MessageHistoryRepository messagehistoryRepository;

    @RequestMapping(value = "/messagehistory/get", method = RequestMethod.GET)
    public MessageHistory getMessage(@RequestParam String id,
                             @RequestParam String userid1,
                             @RequestParam String userid2,
                             @RequestParam String message,
                             @RequestParam String timestamp){
        MessageHistory messagehistory = messagehistoryRepository.findAll().iterator().next();
        return messagehistory;
    }

}
