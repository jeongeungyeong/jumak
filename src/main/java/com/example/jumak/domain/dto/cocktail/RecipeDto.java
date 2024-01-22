package com.example.jumak.domain.dto.cocktail;

import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.stereotype.Component;


@Data
@NoArgsConstructor
public class RecipeDto {
    private Long recipeNumber;
    private String recipeName;
    private String recipeContent;
    private Long recipeAlcoholicity;
    private String recipeIngredient;
    private String recipeGarnish;
}
