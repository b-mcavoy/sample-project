import javax.swing.JFrame;

public class Main {
    
  public static void main( String[] args )
  {
  
  Point p = new Point(4,5);
  Rectangle r = new Rectangle(p, 5, 4);
  System.out.println(r);
    
  JFrame frame = new JFrame( "Points And Rectangles Project" );
  frame.getContentPane().add( new Canvas() );
  frame.setDefaultCloseOperation( JFrame.EXIT_ON_CLOSE );
  frame.pack();
  frame.setSize( 1200, 1000 );
  frame.setVisible( true );
  

  
  
}
    
	    }
