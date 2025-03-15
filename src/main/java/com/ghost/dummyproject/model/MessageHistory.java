package com.ghost.dummyproject.model;


import lombok.Getter;
import lombok.Setter;
import org.springframework.data.annotation.Id;

@Getter
@Setter
public class MessageHistory {
    @Id
    private String id;
    private String name;
    private String message;
    private String timestamp;

    public MessageHistory(String id, String name, String message, String timestamp) {
        this.id = id;
        this.name = name;
        this.message = message;
        this.timestamp = timestamp;
    }

}
