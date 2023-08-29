import java.awt.Graphics;

public class Rectangle
{
    private Point myTopLeft;
    private double myWidth, myHeight, myAngle;

    /**
     * Creates a new Rectangle object.
     * @param topLeft (Point) the top left corner of the Rectangle
     * @param width (double) the horizontal width of the Rectangle
     * @param height  (double) the vertical height of the Rectangle
     */
    public Rectangle( Point topLeft, double width, double height )
    {
        myTopLeft = topLeft;
        myWidth = width;
        myHeight = height;
        myAngle = 0;
    }
    
    /**
     * Returns the top left point of the Rectangle.
     * @return (Point) The top left point of the Rectangle
     */
    public Point getTopLeft() { return myTopLeft; }

    /**
     *
     * @return
     */
    public double getWidth() { return myWidth; }

    /**
     *
     * @return
     */
    public double getHeight() { return myHeight; }

  

    /**
     *
     * @param p
     */
    public void setTopLeft( Point p ) { myTopLeft = p; }

    /**
     *
     * @param w
     */
    public void setWidth( double w ) { myWidth = w; }

    /**
     *
     * @param h
     */
    public void setHeight( double h ) { myHeight = h; }
    
    public void setAngle( double a ) { myAngle = a; }


    public void setSize( double w, double h ) { 
    	myWidth = w;
    	myHeight = h; }

    /**
     *
     * @param d
     */
    public void shrink( double d )
    {
        myWidth *= d/100.0;
        myHeight *= d/100.0;
    }

  public void grow( double d )
    {
      double widthAddition = myWidth *d/100;
       double heightAddition = myHeight *d/100;  
      myWidth += widthAddition;
        myHeight += heightAddition;
    }

  public Point getTopRight()
  {
      double x = myWidth * Math.cos( myAngle );
      double y = myWidth * Math.sin( myAngle );

      return new Point( myTopLeft.getX() + x, myTopLeft.getY() - y );
  }

  /**
   *
   * @return
   */
  public Point getBottomLeft()
  {
      double x = myHeight * Math.sin( myAngle );
      double y = myHeight * Math.cos( myAngle );

      return new Point( myTopLeft.getX() + x, myTopLeft.getY() + y );
  }
  
  public Point getBottomRight()
  {
      Point tr = getTopRight();

      double x = myHeight * Math.sin( myAngle );
      double y = myHeight * Math.cos( myAngle );

      return new Point( tr.getX() + x, tr.getY() + y );
  }

    /**
     *
     * @param r
     * @return
     */
    public String toString ( )
{
    return "[Rectangle: top left Point: " + getTopLeft().toString() +
           ", width: " + getWidth() + ", height: " + getHeight() + "]";
}

    

    /**
     *
     * @param g
     */
  public void draw( Graphics g )
  {
    Point topLeft = myTopLeft;
    Point topRight = getTopRight();
    Point bottomLeft = getBottomLeft();
    Point bottomRight = getBottomRight();
    g.drawLine( (int)topLeft.getX(), (int)topLeft.getY(),
                (int)topRight.getX(), (int)topRight.getY() );
    
    g.drawLine( (int)topRight.getX(), (int)topRight.getY(),
                (int)bottomRight.getX(), (int)bottomRight.getY() );
    g.drawLine( (int)bottomRight.getX(), (int)bottomRight.getY(),
                (int)bottomLeft.getX(), (int)bottomLeft.getY() );
    g.drawLine( (int)bottomLeft.getX(), (int)bottomLeft.getY(),
                (int)topLeft.getX(), (int)topLeft.getY() );
  }
}