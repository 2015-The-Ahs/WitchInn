/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package witchinn;

import images.ResourceTools;
import java.awt.Graphics;
import java.awt.Image;

/**
 *
 * @author mayajones
 */
public class Recipe {
    private Image book;
    private String text = "";
    
    public Recipe(){
        book = ResourceTools.loadImageFromResource("resources/old_book.png");
        text = "This is a very \n fun thing to do";
    }

    void draw(Graphics graphics) {
        graphics.drawImage(book, 90, 90, null);
        graphics.drawString(text, 120, 120);
        
    }
 
    
}
