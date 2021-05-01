package com.glauter.gerenciador.controller;

import com.glauter.gerenciador.model.ApisModel;
import com.glauter.gerenciador.repository.ApisRepository;

import java.util.List;

public class ApisController {
    private ApisRepository repository;

    private ApisModel setApis(ApisModel api){
        return repository.save(api);
    }

    private List<ApisModel> getApisAll(){
        return repository.findAll();
    }

    private ApisModel getByName(String apiName){
        return repository.findByName(apiName);
    }
}
