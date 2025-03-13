package com.ghost.dummyproject.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.Getter;
import lombok.Setter;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import java.util.List;


@Document( value = "users")
@Getter
@Setter
public class User {
    @Id
    private String id;
    private String names;
    private String bio;
    private String image;
    private String profilepicture;

}
