package com.glauter.gerenciador.model;

import lombok.Data;
import org.springframework.data.annotation.Id;

@Data
public class UserModel {
    @Id
    private String id;

    private String name;

    private Integer age;

    private String email;
}
