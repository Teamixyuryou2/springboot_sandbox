package com.ghost.dummyproject.model;


import lombok.Getter;
import lombok.Setter;
import org.springframework.data.annotation.Id;

@Getter
@Setter
public class MessageHistory {
    @Id
    private String id;
    private String userid;
    private String userid2;
    private String message;
    private String timestamp;

    public MessageHistory(String id, String userid, String userid2 , String message, String timestamp) {
        this.id = id;
        this.userid = userid;
        this.userid2 = userid2;
        this.message = message;
        this.timestamp = timestamp;
    }

}
