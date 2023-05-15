package cl.gonzalobenavides.cadenas.controller;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HomeController {

	@RequestMapping("/")
	public String home() {
		return "Hello client, how are you doing?";
	}
	
	@RequestMapping("/random")
	public String random() {
		return "Spring Boot is great! So easy to just respond with strings!";
	}
	
	@RequestMapping("/nombre/{nickname}")
	public String nickname(@PathVariable("nickname") String nickname) {
		return "Hola " + nickname +", bienvenido a Spring Boot!";
	}
}
