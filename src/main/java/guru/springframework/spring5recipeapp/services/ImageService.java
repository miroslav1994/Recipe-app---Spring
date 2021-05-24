package guru.springframework.spring5recipeapp.services;

import guru.springframework.spring5recipeapp.commands.IngredientCommand;
import org.springframework.web.multipart.MultipartFile;

public interface ImageService {

        void saveIMageFile(Long recipeId, MultipartFile file);
}
