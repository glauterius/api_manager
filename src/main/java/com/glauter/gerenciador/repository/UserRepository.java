package com.glauter.gerenciador.repository;

import com.glauter.gerenciador.model.UserModel;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface UserRepository extends MongoRepository<UserModel, String> {
}
