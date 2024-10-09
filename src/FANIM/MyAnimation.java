package FANIM;


import javax.swing.*;
import java.awt.*;

public class MyAnimation extends JPanel {
int x=-150;
int y=100;
int x1=190; //170+20
int y1=-100;
int x2=70;
int y2=500;
int x3=810;
int y3=100;
int x4=300;
int y4=800; // 210 высота на которой должны остановиться буквы 100+height+20+height
int width=100;
int height=50; //высота прямоугольника
int stepsize=10;
int max_x, max_y;
MyAnimation (int w, int h) { 
this.max_x=w; //
this.max_y=h; // размеры окна
}
@Override
public void paint (Graphics g) {
// TODO Auto-generated method stub super.paint (g);
super.paint(g);
g.setColor (Color.BLUE); 
g.fillRect(x, y, width, height);
if (x+width<170) //x+width= растояние до правого края прямоугольника
x=x+stepsize;
g.setColor (Color.GREEN);
g.fillRect(x1, y1, width, height);
if (y1<y+height+20) // y+height= растояние от верха до низа первого прямоугольника
y1=y1+stepsize;
g.setColor (Color.PINK);
g.fillRect(x2, y2, width, height);
if (y2>y+height+20) // y+height= растояние от верха до низа первого прямоугольника
y2=y2-stepsize;
g.setColor (Color.YELLOW);
g.fillRect(x3, y3, width, height);
if (x3>x+width+20) // y+height= растояние от верха до низа первого прямоугольника
x3=x3-stepsize;
g.setColor(Color.WHITE);
g.setFont(new Font(Font.SANS_SERIF, Font.BOLD,100));
g.drawString("Panes", x4, y4);
if (y4>y+height+20+height) 
y4=y4-stepsize;
try {
Thread.sleep (40);
}  catch (InterruptedException e){ // TODO Auto-generated catch block
e.printStackTrace();
}
repaint();
}
}


    /*private static void onRepaint(Graphics g){
    long current_time =System.nanoTime()
    }*/

    /*private static class GameField extends JPanel{
    @Override 
    protected void paintComponent(Graphics g){
        
        super.paintComponent(g);
        onRepaint(g);
        repaint();
    }
}

}*/


