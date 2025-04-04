package com.ghost.dummyproject.controller;


import com.ghost.dummyproject.model.ChatLog;
import com.ghost.dummyproject.model.MessageHistory;
import com.ghost.dummyproject.repository.ChatLogRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
public class ChatLogController {
    @Autowired
    ChatLogRepository chatlogRepository;

    @RequestMapping(value = "/chatlog", method = RequestMethod.POST)
    public String startChatLog(@RequestParam String chatid,
                               @RequestParam String userid,
                               @RequestParam String recipientid,
                               @RequestParam(required = false)String lastmessage) {
        ChatLog chatlog = new ChatLog(chatid, userid, recipientid, lastmessage);
        ChatLog savedChat = chatlogRepository.save(chatlog);
        return "SUCCESS, NEW CHATLOG STARTED : " + savedChat;
    }

    @RequestMapping(value = "/chatlog/get", method = RequestMethod.GET)
    public ChatLog getChatLog(@RequestParam String chatid) {
        ChatLog chatlog = chatlogRepository.findById(chatid).orElse(null);   //Returns chatlog with chatid
        return chatlog;
    }
}
