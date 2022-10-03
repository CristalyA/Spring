package com.helloword.helloword.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping

public class HelloWorldController {

	@GetMapping("/hello-world")
	public String helloWord() {
		return "Hello World !";
	}
	
	@GetMapping("/bsm")
	public String Bsm() {
		return "Mentalidades :<br>Responsabilidade Pessoal <br>Mentalidade de Crescimento <br>Orientação ao futuro <br>Persistência"
				+ "<br>Habilidades comportamentais: <br>Comunicação <br>Atenção aos detalhes <br>Proatividade  ";
	}
	
	@GetMapping("/expectativa")
	public String expectativa() {
		return "Expectativa de aprender a usar o Spring com facilidade .";
	}
	
}

