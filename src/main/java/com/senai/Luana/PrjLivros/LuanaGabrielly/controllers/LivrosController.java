package com.senai.Luana.PrjLivros.LuanaGabrielly.controllers;

import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.senai.Luana.PrjLivros.LuanaGabrielly.entities.Livros;
import com.senai.Luana.PrjLivros.LuanaGabrielly.services.LivrosService;

@RestController
@RequestMapping("/livros")
public class LivrosController {

private final LivrosService livrosService;

	
	public LivrosController(LivrosService livrosService) {
		this.livrosService = livrosService;
	}
	
	@PostMapping
	public Livros createLivros(@RequestBody Livros livros) {
		return livrosService.saveLivros(livros);
	}
	
	@GetMapping
	public List<Livros> getAllLivros() {
		return livrosService.getAllLivros();
	}
	
	public Livros getLivros(@PathVariable Long idcLivros) {
		return livrosService.getLivrosById(idcLivros);
	}
	
	public void deleteLivros(@PathVariable Long idcLivros) {
		livrosService.deleteLivros(idcLivros);
	}
	
}
