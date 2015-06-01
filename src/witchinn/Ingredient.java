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

    public static String TYPE_VINE = "VINE";
    public static String TYPE_TURTLE = "TURTLE";
    public static String TYPE_TREE = "TREE";
    public static String TYPE_CACTUS = "CACTUS";
    public static String TYPE_BULB = "BULB";
    public static String TYPE_DAGGER = "DAGGER";
    public static String TYPE_EARTH = "EARTH";
    public static String TYPE_EGGSHELLS = "EGGSHELLS";
    public static String TYPE_EYES = "EYES";
    public static String TYPE_GAS = "GAS";
    public static String TYPE_GRASS = "GRASS";
    public static String TYPE_GREENS = "GREENS";
    public static String TYPE_MUSHROOMS = "MUSHROOMS";
    public static String TYPE_PETALS = "PETALS";
    public static String TYPE_PINK = "PINK";
    public static String TYPE_ROSE = "ROSE";
    public static String TYPE_SAGE = "SAGE";
    public static String TYPE_SHELLS = "SHELLS";
    public static String TYPE_SMALLPLANT = "SMALLPLANT";
    public static String TYPE_SUNLIGHT = "SUNLIGHT";
    public static String TYPE_VASE = "VASE";
    

    public static Ingredient getIngredient(String type) {

        Ingredient ingredient = new Ingredient(loadImage("resources/vine.png"), new Point(10, 10), new Velocity(0, 0));
        

     
        return ingredient;
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

    public Ingredient(Image image, Point position, Velocity velocity) {
        super(image, position, velocity);
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
