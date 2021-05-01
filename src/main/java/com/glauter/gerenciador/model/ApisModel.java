package com.glauter.gerenciador.model;

import lombok.Data;
import org.springframework.data.annotation.Id;

import java.util.List;

@Data
public class ApisModel {
    @Id
    private String id;
    private String apiName;
    private String namespace;
    private String path;
    private String type;
    private String templateName;

    private List<String> dependencyBy;
}
