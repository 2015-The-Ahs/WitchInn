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

    public static String TYPE_BUG = "BUG";

<<<<<<< HEAD
    public static Ingredient getIngredient(String type){
        Ingredient ingredient = new Ingredient(getImage("resources/cactus.PNG"), new Point (10, 10), new Velocity(0, 0));
 
=======
    public static Ingredient getIngredient(String type) {
        Ingredient ingredient = new Ingredient(loadImage("resources/vine.png"), new Point(10, 10), new Velocity(0, 0));

>>>>>>> origin/master
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


//    public void setName(String shayla) {
//        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
//    }
//
//    public Object getImage() {
//        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
//    }
//
//    public boolean contains(Point point) {
//        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
//    }
//
//    public String getName() {
//        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
//    }
//
//    public Object getObjectBoundary() {
//        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
//    }
    
    

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
