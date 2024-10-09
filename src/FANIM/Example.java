package FANIM;


import javax.swing.JFrame;
import java.awt.*;
public class Example extends JFrame{
Example () {
setSize (800, 600);
setTitle("Graphics programming"); 
setDefaultCloseOperation (EXIT_ON_CLOSE); 
setLocationRelativeTo (null);
MyAnimation panel = new MyAnimation(780,560);
panel.setBackground (Color.black);
add (panel);
}
public static void main(String[] args) {
 // TODO Auto-generated method stub 
new Example ().setVisible (true);
}






}
