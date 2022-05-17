package taco.reposity;

import org.springframework.data.repository.CrudRepository;

import taco.model.Ingredient;

public interface IngredientRepository extends CrudRepository<Ingredient, String>{
	

}
