package guru.springframework.spring5recipeapp.services;

import guru.springframework.spring5recipeapp.commands.IngredientCommand;
import guru.springframework.spring5recipeapp.commands.RecipeCommand;
import guru.springframework.spring5recipeapp.domain.Recipe;

import java.util.Set;

public interface IngredientService {

        IngredientCommand findByRecipeIdAndIngredientId(Long recipeId, Long ingredientId);

        IngredientCommand saveIngredientCommand(IngredientCommand command);

        void deleteById(Long recipeId, Long idToDelete);
}
