package com.glauter.gerenciador.repository;

import com.glauter.gerenciador.model.ApisModel;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface ApisRepository extends MongoRepository<ApisModel, String> {
    ApisModel findByName(String apiName);
}
