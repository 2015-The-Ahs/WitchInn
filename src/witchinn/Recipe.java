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

    public static final String RECIPE_ANOTHER = "Another....";
    public static final String RECIPE_VINE_SALAD = "Vine Salad";
    public static final String RECIPE_CARA = "Caramelized Cara";
    public static final String RECIPE_SHAYLA = "Sautéed Shayla";
    public static final String RECIPE_GEMMA = "Grits 'n Gemma";
    public static final String RECIPE_MAYA = "Minced Maya";

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

