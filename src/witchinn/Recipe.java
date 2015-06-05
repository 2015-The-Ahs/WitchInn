/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package witchinn;

import images.ResourceTools;
import java.awt.Graphics;
import java.awt.Image;
import java.awt.Color;
import java.awt.Font;
import java.util.ArrayList;
import static witchinn.Ingredient.*;

/**
 *
 * @author mayajones
 */
public class Recipe {

    private Image book;
    private String title = "";
    private ArrayList<Ingredient> ingredients;
    
    private Color color;

    public static final String RECIPE_ANOTHER = "Another....";
    public static final String RECIPE_VINE_SALAD = "Vine Salad";
    public static final String RECIPE_CARA = "Caramelized Cara";
    public static final String RECIPE_SHAYLA = "Sautéed Shayla";
    public static final String RECIPE_GEMMA = "Grits 'n Gemma";
    public static final String RECIPE_MAYA = "Minced Maya";

    
    public static Recipe getRecipe(String recipeName){
        Recipe recipe = new Recipe(recipeName);
        
        switch (recipeName){
            
            case RECIPE_ANOTHER:
                recipe.getIngredients().add(getIngredient(INGREDIENT_VINE));
                recipe.getIngredients().add(getIngredient(INGREDIENT_VINE));
                break;
            
            
            default:
            case RECIPE_VINE_SALAD:
                recipe.getIngredients().add(getIngredient(INGREDIENT_VINE));
                recipe.getIngredients().add(getIngredient(INGREDIENT_VINE));
                break;
                
            case RECIPE_CARA:
                recipe.getIngredients().add(getIngredient(INGREDIENT_VINE));
                recipe.getIngredients().add(getIngredient(INGREDIENT_VINE));
                break;
                
            case RECIPE_SHAYLA:
                recipe.getIngredients().add(getIngredient(INGREDIENT_VINE));
                recipe.getIngredients().add(getIngredient(INGREDIENT_VINE));
                break;
            
            case RECIPE_GEMMA:
                recipe.getIngredients().add(getIngredient(INGREDIENT_VINE));
                recipe.getIngredients().add(getIngredient(INGREDIENT_VINE));
                break;
            
            case RECIPE_MAYA:
                recipe.getIngredients().add(getIngredient(INGREDIENT_VINE));
                recipe.getIngredients().add(getIngredient(INGREDIENT_VINE));
                break;
            
        }
        
        return recipe;
    }
    
    
    {
        setBook(ResourceTools.loadImageFromResource("resources/book.PNG").getScaledInstance(600, 430, Image.SCALE_FAST));
        setIngredients(new ArrayList<>());
        
        setTitle("");
    }
    
    public Recipe(String title) {
        book = (ResourceTools.loadImageFromResource("resources/book.PNG").getScaledInstance(600, 430, Image.SCALE_FAST));
        this.title = title;
    }

    void draw(Graphics graphics) {
        graphics.drawImage(getBook(), 140, 90, null);
        
        graphics.setFont(new Font("Comic Sans", Font.PLAIN, 12));
        graphics.setColor(Color.BLUE);
        graphics.drawString(getTitle(), 250, 140);
    }

    /**
     * @return the book
     */
    public Image getBook() {
        return book;
    }

    /**
     * @param book the book to set
     */
    public void setBook(Image book) {
        this.book = book;
    }

    /**
     * @return the title
     */
    public String getTitle() {
        return title;
    }

    /**
     * @param title the title to set
     */
    public void setTitle(String title) {
        this.title = title;
    }

    /**
     * @return the ingredients
     */
    public ArrayList<Ingredient> getIngredients() {
        return ingredients;
    }

    /**
     * @param ingredients the ingredients to set
     */
    public void setIngredients(ArrayList<Ingredient> ingredients) {
        this.ingredients = ingredients;
    }

}

//Change font
//Color of text
//Format the ingredients (into lines)
//Pictures
