/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package assignment_10524192;

/**
 *
 * @author Nana Payne
 */
import java.awt.*;
import javax.swing.JFrame;
public class ACircle extends Canvas {
   public void paint( Graphics g ){
    g.setColor(Color.green);
    g.fillOval(0,0,200,200);
    
}
   public static void main(String[] args){
       JFrame nanapayne = new JFrame("This is a circle");
       nanapayne.setSize(800,600);
       nanapayne.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
       ACircle psalms = new ACircle();
       nanapayne.add(psalms);
       nanapayne.setVisible(true);
   }
}
