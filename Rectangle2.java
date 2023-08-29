
public class Rectangle2 {

	

    private Point myTopLeft;
    private double myWidth, myHeight, myAngle;
    
    
    public Point getTopRight() {
    	double newX = myTopLeft.getX() + myWidth;
    	double newY = myTopLeft.getY();
    	
    	return new Point(newX, newY);
    }
    
    

	
	
}
