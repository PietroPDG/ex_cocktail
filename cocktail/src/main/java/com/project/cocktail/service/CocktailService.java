package com.project.cocktail.service;

import com.project.cocktail.dto.DrinksDto;

public interface CocktailService {

	String getCocktailsByLetter(String letter);
	
	DrinksDto getCocktailsByLetterWithDto(String letter);

}
