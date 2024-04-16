package com.project.cocktail.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.project.cocktail.dto.DrinksDto;
import com.project.cocktail.service.CocktailService;

@RestController
@RequestMapping(path="/v1/cocktail")
public class CocktailController {
	
	@Autowired
	public CocktailService cocktailService;
	
	@GetMapping("/list")
	public String getCocktailsByFirstLetter(@RequestParam("letter") String letter) {
	    return cocktailService.getCocktailsByLetter(letter);
	}
	
	@GetMapping("/list/dto")
	public ResponseEntity<DrinksDto> getCocktailsByFirstLetterWithDto(@RequestParam("letter") String letter) {
	    DrinksDto dto = cocktailService.getCocktailsByLetterWithDto(letter);
	    if (dto != null) {
            return ResponseEntity.ok(dto);
        } else {
            return ResponseEntity.status(HttpStatus.NOT_FOUND).build();
        }
	}
}
