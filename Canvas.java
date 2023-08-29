import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.BasicStroke;

import java.awt.Color;
import javax.swing.JPanel;

/*
The JPanel class is used to create containers:
https://docs.oracle.com/javase/7/docs/api/javax/swing/JPanel.html
https://docs.oracle.com/javase/tutorial/uiswing/components/panel.html
*/
public class Canvas extends JPanel { 

  /*
    Overrides JPanel's paintComponent method to draw our Rectangle
  */
  public void paintComponent( Graphics g ){
	  this.setBackground(new Color(0, 0, 0));
    super.paintComponent( g ); //paint for graphics
    Point p = new Point( 500, 300 );
    Rectangle r = new Rectangle( p, 500, 400 );
    
    /*
    g.setColor(new Color(255, 255, 255));
    r.draw(g);
    g.drawLine( 200, 200, 269, 160 );
	g.drawLine(269,160, 289,194 );
	g.drawLine(289,194,219,234);
	g.drawLine(219,234,200,200 );
	 */   
    

    
     double a = 0;
    for(int i = 0; i<39; i ++){
    	r.setAngle(a/4);
      int blue = (int)(Math.random() * (255 + 1));
      int green = (int)(Math.random() * (255 + 1));
      int red = (int)(Math.random() * (255 + 1));
      //int width = (int)(Math.random() * (350 + 1)) + 50;
      //int height = (int)(Math.random() * (350 + 1)) + 50;
      //r.setSize(width, height);
      g.setColor(new Color(red, green, blue));
      //int stroke = (int)(Math.random() * (5 + 1)) + 1;
      
      Graphics2D g2 = (Graphics2D) g;
      
      g2.setStroke(new BasicStroke(3));
      
      r.draw(g2);
      int randX = (int)(Math.random() * (400 + 1)) + 50;
      int randY = (int)(Math.random() * (400 + 1)) + 50;
     // p.setX(randX);
     // p.setY(randY);
      
      a += Math.PI/6;
      r.shrink(95);
    }
    
  }
}