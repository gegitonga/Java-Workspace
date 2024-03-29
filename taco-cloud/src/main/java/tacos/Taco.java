package tacos;

import java.util.List;

import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Size;
import lombok.Data;

@Data
public class Taco {
	@NotNull
	@Size(min = 5, message="Name must be atleast 5 char")
	private String name;
	
	@NotNull
	@Size(min = 5, message="Choose atleat one ingrdient")
	private List<Ingredient> ingredients;
}
