package com.glauter.gerenciador;

import com.glauter.gerenciador.controller.UserController;
import com.glauter.gerenciador.model.UserModel;
import com.glauter.gerenciador.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.context.event.ApplicationReadyEvent;
import org.springframework.context.event.EventListener;

@SpringBootApplication
public class GerenciadorApplication {

	@Autowired
	private UserController user;

	public static void main(String[] args) {
		SpringApplication.run(GerenciadorApplication.class, args);
	}

	@EventListener(ApplicationReadyEvent.class)
	public void afterTheStart() {
		System.out.println("the application started...");
		System.out.println(user.setUser());
	}
}
