package guru.springframework.spring5recipeapp.commands;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.math.BigDecimal;

/**
 * Created by jt on 6/21/17.
 */
@Getter
@Setter
@NoArgsConstructor
public class IngredientCommand {
    private Long id;
    private Long recipeId;
    private String description;

    public UnitOfMeasureCommand getUnitOfMeasure() {
        return uom;
    }

    public void setUnitOfMeasure(UnitOfMeasureCommand uom) {
        this.uom = uom;
    }

    private BigDecimal amount;
    private UnitOfMeasureCommand uom;
}