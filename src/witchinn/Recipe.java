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
import java.awt.FontFormatException;
import java.io.IOException;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import static witchinn.Ingredient.*;

/**
 *
 * @author mayajones
 */
public class Recipe {

    public static final String RECIPE_LOVE_POTION = "Love Potion";       
    public static final String RECIPE_HAPPY_PLACE = "Happy Place";
    public static final String RECIPE_REVENGE = "Revenge";
    public static final String RECIPE_KNOWLEDGE = "Knowledge";
    public static final String RECIPE_BETWEEN_A_ROCK_AND_A_HARD_PLACE = "Between a Rock and a Hard Place";

    private static Font loadFont(String resource, float size) {
        Font font = null;
        try {
            ClassLoader classLoader = Thread.currentThread().getContextClassLoader();
            InputStream input = classLoader.getResourceAsStream(resource);

            font = Font.createFont(Font.TRUETYPE_FONT, input).deriveFont(size);
        } catch (FontFormatException | IOException ex) {
            Logger.getLogger(Recipe.class.getName()).log(Level.SEVERE, null, ex);
        }
        return font;
    }

    public static Recipe getRecipe(String recipeName) {
        Recipe recipe = new Recipe(recipeName);

        switch (recipeName) {

            case RECIPE_LOVE_POTION:
                recipe.getIngredients().add(getIngredient(INGREDIENT_SUNLIGHT));
                recipe.getIngredients().add(getIngredient(INGREDIENT_EARTH));
                recipe.getIngredients().add(getIngredient(INGREDIENT_PETALS));
                recipe.getIngredients().add(getIngredient(INGREDIENT_EGGSHELLS));
                break;

            default:
            case RECIPE_HAPPY_PLACE:
                recipe.getIngredients().add(getIngredient(INGREDIENT_MUSHROOMS));
                recipe.getIngredients().add(getIngredient(INGREDIENT_EYES));
                recipe.getIngredients().add(getIngredient(INGREDIENT_GRASS));
                recipe.getIngredients().add(getIngredient(INGREDIENT_GAS));
                break;

            case RECIPE_REVENGE:
                recipe.getIngredients().add(getIngredient(INGREDIENT_ROSE));
                recipe.getIngredients().add(getIngredient(INGREDIENT_DAGGER));
                recipe.getIngredients().add(getIngredient(INGREDIENT_TREE));
                recipe.getIngredients().add(getIngredient(INGREDIENT_BULB));
                break;

            case RECIPE_KNOWLEDGE:
//                recipe.getIngredients().add(getIngredient(INGREDIENT_BOOK));
                recipe.getIngredients().add(getIngredient(INGREDIENT_SAGE));
                recipe.getIngredients().add(getIngredient(INGREDIENT_VINE));
                recipe.getIngredients().add(getIngredient(INGREDIENT_GRASS));
                break;

            case RECIPE_BETWEEN_A_ROCK_AND_A_HARD_PLACE:
                recipe.getIngredients().add(getIngredient(INGREDIENT_CACTUS));
                recipe.getIngredients().add(getIngredient(INGREDIENT_TURTLE));            
                break;

        }

        return recipe;
    }

//<editor-fold defaultstate="collapsed" desc="Constructors">
    {
        setBook(ResourceTools.loadImageFromResource("resources/book.PNG").getScaledInstance(600, 430, Image.SCALE_FAST));
        setIngredients(new ArrayList<>());

        setTitle("");
        font = loadFont("resources/Zeyada.ttf", (float) 32.0);
    }

    public Recipe(String title) {
        book = (ResourceTools.loadImageFromResource("resources/book.PNG").getScaledInstance(600, 430, Image.SCALE_FAST));
        this.title = title;
    }
//</editor-fold>

//<editor-fold defaultstate="collapsed" desc="Methods">
    void draw(Graphics graphics) {
        graphics.drawImage(getBook(), 140, 90, null);

        if (font != null) {
            graphics.setFont(font);
        } else {
            graphics.setFont(new Font("Comic Sans", Font.PLAIN, 12));
        }

//        graphics.setFont(new Font("Comic Sans", Font.PLAIN, 12));
        graphics.setColor(Color.BLACK);
        graphics.drawString(getTitle(), 230, 200);
    }
//</editor-fold>

    private Image book;
    private String title = "";
    private ArrayList<Ingredient> ingredients;

    private Color color;
    private Font font;

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