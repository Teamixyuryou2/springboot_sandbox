package com.ghost.dummyproject.model;


import lombok.Getter;
import lombok.Setter;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import java.util.List;

@Document( value = "chatlog")

@Getter
@Setter
public class ChatLog {
    @Id
    private String chatid;
    private String userid;
    private String recipientid;
    private String lastmessage;
    private List<MessageHistory> messageHistory;

    public ChatLog(String chatid, String userid, String recipientid, String lastmessage) {
        this.chatid = chatid;
        this.userid = userid;
        this.recipientid = recipientid;
        this.lastmessage = lastmessage;
    }

}
