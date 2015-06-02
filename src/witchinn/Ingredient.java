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
                return new Ingredient(loadImage("resources/turtle.png"), new Point(30, 10));
                
            case INGREDIENT_TREE:
                return new Ingredient(loadImage("resources/tree.PNG"), new Point(60, 10));
                
            default:
            case INGREDIENT_VINE:
                return new Ingredient(loadImage("resources/vine.png"), new Point(10, 10));
        }
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
        preferredSize = new Dimension(50, 50);
    }

//    public Ingredient(Image image, Point position, Velocity velocity) {
    public Ingredient(Image image, Point position) {
        super(image, position, new Velocity(0, 0));
    }

    private boolean visible = true;
    private Dimension preferredSize;

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


}
