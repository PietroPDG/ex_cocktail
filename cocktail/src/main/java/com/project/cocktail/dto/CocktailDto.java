package com.project.cocktail.dto;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;

@JsonIgnoreProperties(ignoreUnknown = true)
public class CocktailDto {
	@JsonProperty("idDrink")
	private String idDrink;
	
	@JsonProperty("strDrink")
	private String strDrink;
	
	@JsonProperty("strCategory")
	private String strCategory;
	
	@JsonProperty("strAlcoholic")
	private String strAlcoholic;
	
	@JsonProperty("strGlass")
	private String strGlass;
	
	@JsonProperty("strInstructions")
	private String strInstructions;
	
	@JsonProperty("strInstructionsES")
	private String strInstructionsES;
	
	@JsonProperty("strInstructionsDE")
	private String strInstructionsDE;
	
	@JsonProperty("strInstructionsFR")
	private String strInstructionsFR;
	
	@JsonProperty("strInstructionsIT")
	private String strInstructionsIT;
	
	@JsonProperty("strDrinkThumb")
	private String strDrinkThumb;
	
	@JsonProperty("strIngredient1")
	private String strIngredient1;
	
	@JsonProperty("strIngredient2")
	private String strIngredient2;
	
	@JsonProperty("strIngredient3")
	private String strIngredient3;
	
	@JsonProperty("strIngredient4")
	private String strIngredient4;
	
	@JsonProperty("dateModified")
	private String dateModified;
	
	public String getIdDrink() {
		return idDrink;
	}
	public void setIdDrink(String idDrink) {
		this.idDrink = idDrink;
	}
	public String getStrDrink() {
		return strDrink;
	}
	public void setStrDrink(String strDrink) {
		this.strDrink = strDrink;
	}
	public String getStrCategory() {
		return strCategory;
	}
	public void setStrCategory(String strCategory) {
		this.strCategory = strCategory;
	}
	public String getStrAlcoholic() {
		return strAlcoholic;
	}
	public void setStrAlcoholic(String strAlcoholic) {
		this.strAlcoholic = strAlcoholic;
	}
	public String getStrGlass() {
		return strGlass;
	}
	public void setStrGlass(String strGlass) {
		this.strGlass = strGlass;
	}
	public String getStrInstructions() {
		return strInstructions;
	}
	public void setStrInstructions(String strInstructions) {
		this.strInstructions = strInstructions;
	}
	public String getStrInstructionsES() {
		return strInstructionsES;
	}
	public void setStrInstructionsES(String strInstructionsES) {
		this.strInstructionsES = strInstructionsES;
	}
	public String getStrInstructionsDE() {
		return strInstructionsDE;
	}
	public void setStrInstructionsDE(String strInstructionsDE) {
		this.strInstructionsDE = strInstructionsDE;
	}
	public String getStrInstructionsFR() {
		return strInstructionsFR;
	}
	public void setStrInstructionsFR(String strInstructionsFR) {
		this.strInstructionsFR = strInstructionsFR;
	}
	public String getStrInstructionsIT() {
		return strInstructionsIT;
	}
	public void setStrInstructionsIT(String strInstructionsIT) {
		this.strInstructionsIT = strInstructionsIT;
	}
	public String getStrDrinkThumb() {
		return strDrinkThumb;
	}
	public void setStrDrinkThumb(String strDrinkThumb) {
		this.strDrinkThumb = strDrinkThumb;
	}
	public String getStrIngredient1() {
		return strIngredient1;
	}
	public void setStrIngredient1(String strIngredient1) {
		this.strIngredient1 = strIngredient1;
	}
	public String getStrIngredient2() {
		return strIngredient2;
	}
	public void setStrIngredient2(String strIngredient2) {
		this.strIngredient2 = strIngredient2;
	}
	public String getStrIngredient3() {
		return strIngredient3;
	}
	public void setStrIngredient3(String strIngredient3) {
		this.strIngredient3 = strIngredient3;
	}
	public String getStrIngredient4() {
		return strIngredient4;
	}
	public void setStrIngredient4(String strIngredient4) {
		this.strIngredient4 = strIngredient4;
	}
	public String getDateModified() {
		return dateModified;
	}
	public void setDateModified(String dateModified) {
		this.dateModified = dateModified;
	}
}
