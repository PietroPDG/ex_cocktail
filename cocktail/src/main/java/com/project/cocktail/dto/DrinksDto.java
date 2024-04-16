package com.project.cocktail.dto;

import java.util.List;

public class DrinksDto {
	public List<CocktailDto> drinks;

	public List<CocktailDto> getDrinks() {
		return drinks;
	}

	public void setDrinks(List<CocktailDto> drinks) {
		this.drinks = drinks;
	}
	
}
