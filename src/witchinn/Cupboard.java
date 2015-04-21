package witchinn;

import java.awt.Graphics;
import java.awt.List;
import java.awt.Point;
import java.util.ArrayList;
import java.util.Arrays;

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
        ingredients = new Ingredient[3][4];
        
        getIngredients()[0][0] = Ingredient.getIngredient(Ingredient.TYPE_BUG);
        getIngredients()[0][0].setName("Shayla");
        getIngredients()[1][2] = Ingredient.getIngredient(Ingredient.TYPE_BUG);
        getIngredients()[1][2].setName("Gemma");
        getIngredients()[2][3] = Ingredient.getIngredient(Ingredient.TYPE_BUG);
        getIngredients()[2][3].setName("Maya");
       
    }
    
    public void paint(Graphics graphics){
        for (int row = 0; row < ingredients.length; row++){
            for (int col = 0; col < ingredients[row].length; col++){
                if ((ingredients[row][col] != null) && (ingredients[row][col].isVisible())){
                    Point ingPosn = (Point) getPosition().clone();
                    ingPosn.x += col * 50;
                    ingPosn.y += row * 75;
                    
                    graphics.drawImage(ingredients[row][col].getImage().getScaledInstance(50, 50, 50), ingPosn.x, ingPosn.y, null);
                }
            }
        }
    }

    private Point position = new Point(100, 100);
    private Ingredient[][] ingredients;
    
    /**
     *
     * @return
     */
    public ArrayList<Ingredient> getIngredientList(){
        ArrayList<Ingredient> bad = new ArrayList<>();
        
        for (int row = 0; row < ingredients.length; row++) {
            for (int col = 0; col < ingredients[row].length; col++) {
                if (ingredients[row][col] != null){
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
