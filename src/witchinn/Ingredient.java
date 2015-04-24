/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package witchinn;

import environment.Actor;
import environment.Velocity;
import images.ResourceTools;
import java.awt.Image;
import java.awt.Point;

/**
 *
 * @author carateresa
 */
public class Ingredient extends Actor {
    public static String TYPE_BUG = "BUG";

    public static Ingredient getIngredient(String type){
        Ingredient ingredient = new Ingredient(getImage("resources/vine.png"), new Point (10, 10), new Velocity(0, 0));
 
        return ingredient;
    }
    
    public static Image getImage(String path){
        return ResourceTools.loadImageFromResource(path);
    }
    
    public Ingredient(Image image, Point position, Velocity velocity) {
        super(image, position, velocity);
    }
    
    
    private boolean visible = true;

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
    
    
}
