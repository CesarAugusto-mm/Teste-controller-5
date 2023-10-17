package com.MetodosVerbosHttp.Controller;

import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PatchMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("TesteApi")
public class TesteController {
	
	@GetMapping
	public String retornandoStringMetodos () {
		return "O protocolo HTTP define oito métodos de requisição (GET, POST, PUT, DELETE, "
				+ "HEAD, TRACE, OPTIONS e CONNECT)";
	}
	
	@GetMapping("/1")
	public String retornandoStringVerbos () {
		return "DELETE	Apaga determinado recurso."
				+ "CONNECT	Estabelece um túnel de conexão para um servidor com base em um recurso."
				+ "OPTIONS	Utilizado para definir as opções para comunicação com um determinado recurso.";
		
	}
	
	@PostMapping
	/*Criar um recurso*/
	public String post (@RequestBody String texto) {	
	System.out.println(texto);	
	return texto;

	}
	
	@PutMapping
	/*Atualizar recurso*/
	public String put (@RequestBody String texto) {
		System.out.println(texto);
		return texto;
	}
	
	@PatchMapping
	/*Fazer a alteração de valores específicos de um recurso*/
	public String patch (@RequestBody String texto) {
		System.out.println(texto);
		return texto;
	}
	
	@DeleteMapping
	/*Remoção recurso*/
	public String deletado () {
		return "deleta alguma coisa pelo amor!!!";
	}

}
