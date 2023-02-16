package org.example.entity;

import lombok.*;
import org.example.entity.enums.USER_ROLE;

import java.util.List;

@Builder
@Data
public class User{

    private Long id;
    private String email;
    private String name;
    private String photo;

    private Family family;

    private List<Task> tasks;

    private USER_ROLE user_role;
}