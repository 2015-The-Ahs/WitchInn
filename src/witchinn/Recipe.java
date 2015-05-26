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

/**
 *
 * @author mayajones
 */
public class Recipe {
   private Image book;
    private String text = "";
    private String text2 = "";
    private Color color;
    
    public Recipe(){
        book = ResourceTools.loadImageFromResource("resources/old_book.png");
        text = "swaggygswaygwysgsway";
        text2 = "mr. lawrence can't kobe";
        
    }

    void draw(Graphics graphics) {
        graphics.drawImage(book, 140, 90, null);
        graphics.setFont(new Font("Comic Sans", Font.PLAIN, 12));
        graphics.setColor(Color.RED);
        graphics.drawString(text, 250, 140);

        
        
    }
 
    
}

//Change font
//Color of text
//Format the ingredients (into lines)
//Pictures
