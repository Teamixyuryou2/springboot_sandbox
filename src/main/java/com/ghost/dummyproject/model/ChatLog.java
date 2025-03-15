package com.ghost.dummyproject.model;


import lombok.Getter;
import lombok.Setter;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document( value = "chatlog")

@Getter
@Setter
public class ChatLog {
    @Id
    private String userid;
    private String recipientid;
    private String lastmessage;

    public ChatLog(String userid, String recipientid, String lastmessage) {
        this.userid = userid;
        this.recipientid = recipientid;
        this.lastmessage = lastmessage;
    }

}
