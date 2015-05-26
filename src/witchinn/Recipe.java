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
        text = "swaggygswaygwysgsway";
    }

    void draw(Graphics graphics) {
        graphics.drawImage(book, 140, 90, null);
        graphics.drawString(text, 250, 140);
        
    }
 
    
}

//Change font
//Color of text
//Format the ingredients (into lines)
//Pictures
