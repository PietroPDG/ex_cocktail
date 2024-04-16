package com.project.cocktail.service.impl;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.project.cocktail.dto.DrinksDto;
import com.project.cocktail.service.CocktailService;

@Service
public class CocktailServiceImpl implements CocktailService {
	
	@Value("${url.cocktails}")
	private String url;
	
	@Value("${url.cocktails.by.first.letter}")
	private String urlCocktailsByFirstLetter;
	
	@Value("${url.cocktail.detail}")
	private String urlCocktailDetail;
	
	@Value("${url.cocktails.by.ingredients}")
	private String urlCocktailsByIngredients;
	
    private final RestTemplate restTemplate;
    
    public CocktailServiceImpl(RestTemplate restTemplate) {
        this.restTemplate = restTemplate;
    }
	
    @Override
	public String getCocktailsByLetter(String letter) {
    	String totalUrl = url+urlCocktailsByFirstLetter+letter;
    	System.out.println("url:: " + totalUrl);
        return restTemplate.getForObject(totalUrl, String.class);
    }

	@Override
	public DrinksDto getCocktailsByLetterWithDto(String letter) {
		String totalUrl = url+urlCocktailsByFirstLetter+letter;
    	System.out.println("url:: " + totalUrl);
    	
    	ObjectMapper objectMapper = new ObjectMapper();
    	
    	String response = restTemplate.getForObject(totalUrl, String.class);
    	try {
           
            return objectMapper.readValue(response, DrinksDto.class);
        } catch (Exception e) {
            e.printStackTrace();
            return null;
        }
	}
}
