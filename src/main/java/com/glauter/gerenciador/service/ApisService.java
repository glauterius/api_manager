package com.glauter.gerenciador.service;

import com.glauter.gerenciador.model.ApisModel;
import com.glauter.gerenciador.repository.ApisRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ApisService {

    @Autowired
    private ApisRepository repository;

    public ApisService(ApisRepository repository) {
        this.repository = repository;
    }

    public ApisModel save(ApisModel api){
        return repository.save(api);
    }

    private ApisModel getByName(String apiName){
        return repository.findByApiName(apiName);
    }

    public List<ApisModel> getApiAll(ApisModel api) {
        return repository.findAll();
    }
}
