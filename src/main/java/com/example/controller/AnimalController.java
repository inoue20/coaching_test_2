package com.example.controller;

import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import com.example.entity.Animal;
import com.example.service.AnimalService;

@Controller
public class AnimalController {
	/*Q2-1*/
	private AnimalService animalService;

	public AnimalController(AnimalService animalService) {
		this.animalService = animalService;
	}

	@GetMapping("/index")
	public String index(Model model) {
		List<Animal> animals = animalService.index();
		model.addAttribute("animals", animals);
		return "index";
	}
}
