package witchinn;

import java.awt.Graphics;
import java.awt.Point;
import java.util.ArrayList;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author mayajones
 */
public class Cupboard {

    {
        ingredients = new Ingredient[4][12];

        getIngredients()[3][7] = Ingredient.getIngredient(Ingredient.INGREDIENT_VINE);
        getIngredients()[1][1] = Ingredient.getIngredient(Ingredient.INGREDIENT_GREENS);
        getIngredients()[1][2] = Ingredient.getIngredient(Ingredient.INGREDIENT_TURTLE);
        getIngredients()[1][3] = Ingredient.getIngredient(Ingredient.INGREDIENT_TREE);
        getIngredients()[1][4] = Ingredient.getIngredient(Ingredient.INGREDIENT_BULB);
        getIngredients()[1][5] = Ingredient.getIngredient(Ingredient.INGREDIENT_CACTUS);
        getIngredients()[1][6] = Ingredient.getIngredient(Ingredient.INGREDIENT_DAGGER);
        getIngredients()[1][7] = Ingredient.getIngredient(Ingredient.INGREDIENT_EARTH);
        getIngredients()[1][0] = Ingredient.getIngredient(Ingredient.INGREDIENT_EGGSHELLS);
        getIngredients()[3][6] = Ingredient.getIngredient(Ingredient.INGREDIENT_GAS);
        getIngredients()[3][0] = Ingredient.getIngredient(Ingredient.INGREDIENT_MUSHROOMS);
//       getIngredients()[3][4] = Ingredient.getIngredient(Ingredient.INGREDIENT_PETALS);
        getIngredients()[3][1] = Ingredient.getIngredient(Ingredient.INGREDIENT_PINK);
        getIngredients()[3][2] = Ingredient.getIngredient(Ingredient.INGREDIENT_SAGE);
        getIngredients()[3][3] = Ingredient.getIngredient(Ingredient.INGREDIENT_ROSE);

        getIngredients()[3][4] = Ingredient.getIngredient(Ingredient.INGREDIENT_SMALLPLANT);
        getIngredients()[3][5] = Ingredient.getIngredient(Ingredient.INGREDIENT_SUNLIGHT);

    }

    public void paint(Graphics graphics) {
        for (int row = 0; row < ingredients.length; row++) {
            for (int col = 0; col < ingredients[row].length; col++) {
                if ((ingredients[row][col] != null) && (ingredients[row][col].isVisible())) {
                    Point ingPosn = (Point) getPosition().clone();
                    ingPosn.x += col * 50;
                    ingPosn.y += row * 60;
                    ingredients[row][col].setPosition(ingPosn);
                    ingredients[row][col].paint(graphics);
                }
            }
        }
    }

    private Point position = new Point(50, 50);
    private Ingredient[][] ingredients;

    /**
     *
     * @return
     */
    public ArrayList<Ingredient> getIngredientList() {
        ArrayList<Ingredient> bad = new ArrayList<>();

        for (int row = 0; row < ingredients.length; row++) {
            for (int col = 0; col < ingredients[row].length; col++) {
                if (ingredients[row][col] != null) {
                    bad.add(ingredients[row][col]);
                }
            }
        }
        return bad;
    }

    /**
     * @return the ingredients
     */
    public Ingredient[][] getIngredients() {
        return ingredients;
    }

    /**
     * @param ingredients the ingredients to set
     */
    public void setIngredients(Ingredient[][] ingredients) {
        this.setIngredients(ingredients);
    }

    /**
     * @return the position
     */
    public Point getPosition() {
        return position;
    }

    /**
     * @param position the position to set
     */
    public void setPosition(Point position) {
        this.position = position;
    }
}
