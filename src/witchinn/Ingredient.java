/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package witchinn;

import environment.Actor;
import environment.Velocity;
import images.ResourceTools;
import java.awt.Dimension;
import java.awt.Graphics;
import java.awt.Image;
import java.awt.Point;

/**
 *
 * @author carateresa
 */
public class Ingredient extends Actor {

    public static final String INGREDIENT_VINE = "VINE";
    public static final String INGREDIENT_TURTLE = "TURTLE";
    public static final String INGREDIENT_TREE = "TREE";
    public static final String INGREDIENT_CACTUS = "CACTUS";
    public static final String INGREDIENT_BULB = "BULB";
    public static final String INGREDIENT_DAGGER = "DAGGER";
    public static final String INGREDIENT_EARTH = "EARTH";
    public static final String INGREDIENT_EGGSHELLS = "EGGSHELLS";
    public static final String INGREDIENT_EYES = "EYES";
    public static final String INGREDIENT_GAS = "GAS";
    public static final String INGREDIENT_GRASS = "GRASS";
    public static final String INGREDIENT_GREENS = "GREENS";
    public static final String INGREDIENT_MUSHROOMS = "MUSHROOMS";
    public static final String INGREDIENT_PETALS = "PETALS";
    public static final String INGREDIENT_PINK = "PINK";
    public static final String INGREDIENT_ROSE = "ROSE";
    public static final String INGREDIENT_SAGE = "SAGE";
    public static final String INGREDIENT_SHELLS = "SHELLS";
    public static final String INGREDIENT_SMALLPLANT = "SMALLPLANT";
    public static final String INGREDIENT_SUNLIGHT = "SUNLIGHT";
    public static final String INGREDIENT_VASE = "VASE";
    

    public static Ingredient getIngredient(String name) {

        switch (name){
            case INGREDIENT_TURTLE:
                return new Ingredient(name, loadImage("resources/turtle.PNG"), new Point(10, 10));
                
            case INGREDIENT_TREE:
                return new Ingredient(name, loadImage("resources/tree.PNG"), new Point(10, 10));
                
            case INGREDIENT_CACTUS:
                return new Ingredient(name, loadImage("resources/cactus.PNG"), new Point(10, 10));
                
            case INGREDIENT_BULB:
                return new Ingredient(name, loadImage("resources/bulb.PNG"), new Point(10, 10)); 
                
            case INGREDIENT_DAGGER:
                return new Ingredient(name, loadImage("resources/dagger.PNG"), new Point(10, 10)); 
                
            case INGREDIENT_EARTH:
                return new Ingredient(name, loadImage("resources/earth.PNG"), new Point(10, 10));
                
            case INGREDIENT_EGGSHELLS:
                return new Ingredient(name, loadImage("resources/eggshells.PNG"), new Point(10, 10));   
                
            case INGREDIENT_EYES:
                return new Ingredient(name, loadImage("resources/eyes.PNG"), new Point(10, 10));    
                
            case INGREDIENT_GAS:
                return new Ingredient(name, loadImage("resources/gas.PNG"), new Point(10, 10));   
                
            case INGREDIENT_GRASS:
                return new Ingredient(name, loadImage("resources/grass.PNG"), new Point(10, 10)); 
                
            case INGREDIENT_GREENS:
                return new Ingredient(name, loadImage("resources/greens.PNG"), new Point(10, 10)); 
               
            case INGREDIENT_MUSHROOMS:
                return new Ingredient(name, loadImage("resources/mushrooms.PNG"), new Point(10, 10));    
                
            case INGREDIENT_PETALS:
                return new Ingredient(name, loadImage("resources/petals.PNG"), new Point(10, 10));  
                
            case INGREDIENT_PINK:
                return new Ingredient(name, loadImage("resources/shells.PNG"), new Point(10, 10));   
                
            case INGREDIENT_ROSE:
                return new Ingredient(name, loadImage("resources/rose.PNG"), new Point(10, 10)); 
                
            case INGREDIENT_SAGE:
                return new Ingredient(name, loadImage("resources/sage.PNG"), new Point(10, 10));
                
            case INGREDIENT_SHELLS:
                return new Ingredient(name, loadImage("resources/shells.PNG"), new Point(10, 10));
                
            case INGREDIENT_SMALLPLANT:
                return new Ingredient(name, loadImage("resources/smallplant.PNG"), new Point(10, 10));     
                
            case INGREDIENT_SUNLIGHT:
                return new Ingredient(name, loadImage("resources/sunlight.PNG"), new Point(10, 10)); 
                
            case INGREDIENT_VASE:
                return new Ingredient(name, loadImage("resources/vase.PNG"), new Point(10, 10)); 
                
            default:
            case INGREDIENT_VINE:
                return new Ingredient(name, loadImage("resources/vine.png"), new Point(10, 10));
        
        }        
    }

//    public static String TYPE_BUG = "BUG";
//    public static final String INGREDIENT_NEWT_WINGS = "Newt Wings";
    

//    public static Ingredient getIngredient(String name) {
//        Ingredient ingredient = new Ingredient(name, loadImage("resources/vine.png"), new Point(10, 10), new Velocity(0, 0));
//        ingredient.setName(name);
//        return ingredient;   
//    }
    
    public Ingredient(Image image, Point position, Velocity velocity) {
        super(image, position, velocity);
    }



    @Override
    public Ingredient clone() throws CloneNotSupportedException {
        return getIngredient(this.getName());
    }
    
    @Override
    public void paint(Graphics graphics){
        graphics.drawImage(getScaledImage(), getPosition().x, getPosition().y, null);
    }

    public static Image loadImage(String path) {
        return ResourceTools.loadImageFromResource(path);
    }

    Image getScaledImage() {
        return super.getImage().getScaledInstance(preferredSize.width, preferredSize.height, Image.SCALE_FAST);
    }

    {
        preferredSize = new Dimension(45, 60);
    }

    public Ingredient(String name, Image image, Point position) {
        super(image, position, new Velocity(0, 0));
        this.name = name;
    }

    private boolean visible = true;
    private Dimension preferredSize;
    private String name;

    /**
     * @return the visible
     */
    public boolean isVisible() {
        return visible;
    }

    /**
     * @param visible the visible to set
     */
    public void setVisible(boolean visible) {
        this.visible = visible;
    }


    /**
     * @return the preferredSize
     */
    public Dimension getPreferredSize() {
        return preferredSize;
    }

    /**
     * @param preferredSize the preferredSize to set
     */
    public void setPreferredSize(Dimension preferredSize) {
        this.preferredSize = preferredSize;
    }

    /**
     * @return the name
     */
    public String getName() {
        return name;
    }

    /**
     * @param name the name to set
     */
    public void setName(String name) {
        this.name = name;
    }

}
