public class Point {
  
	//creates variables x and y
    private double x;
    private double y;
  
    //this constructs the object Point and initializes 
    //the specific variables needed, (x and y)
    public Point(double x, double y){
    	this.x = x;
    	this.y = x;
    }

    //returns the x variable
    public double getX(){   
    	return x;
    }
  
    //returns the y variable
    public double getY(){   
    	return y;
    }

    //updates the x variable
    public void setX(double x){ 
    	this.x = x; 
    }
  
    //resets and updates the y variable
    public void setY(double y){ 
	  this.y = y; 
    }
  
    //Overrides the original printing to instead print what I tell it here
    public String toString(){
    	return "(" + x + "," + y + ")"; 
    }
  
}