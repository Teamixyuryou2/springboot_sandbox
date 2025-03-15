package com.ghost.dummyproject.controller;


import com.ghost.dummyproject.model.ChatLog;
import com.ghost.dummyproject.repository.ChatLogRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ChatLogController {
    @Autowired
    ChatLogRepository chatlogRepository;

    @RequestMapping(value = "/chatlog", method = RequestMethod.POST)
    public String startChatLog(@RequestParam String userid,
                               @RequestParam String recipientid,
                               @RequestParam(required = false)String lastmessage) {
        ChatLog chatlog = new ChatLog(userid, recipientid, lastmessage);
        ChatLog savedChat = chatlogRepository.save(chatlog);
        return "SUCCESS, NEW CHATLOG STARTED : " + savedChat;
    };

}
