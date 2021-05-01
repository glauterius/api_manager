package com.glauter.gerenciador.controller;

import com.glauter.gerenciador.model.ApisModel;
import com.glauter.gerenciador.repository.ApisRepository;
import com.glauter.gerenciador.service.ApisService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(path = "/api_manager")
public class ApisController {

    @Autowired
    private ApisService service;

    @PostMapping(path = "/api", produces = MediaType.APPLICATION_JSON_VALUE, consumes = MediaType.APPLICATION_JSON_VALUE)
    public ApisModel postApi(ApisModel api){
        return service.save(api);
    }

    @GetMapping(path = "/api", produces = MediaType.APPLICATION_JSON_VALUE, consumes = MediaType.APPLICATION_JSON_VALUE)
    private List<ApisModel> getApisAll(ApisModel api){
        return service.getApiAll(api);
    }
}
