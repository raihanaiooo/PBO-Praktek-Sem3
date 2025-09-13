public class Circle{
    private double radius;
    private String color;

    // Default constructor
    public Circle(){
        radius = 1.0;
        color = "red";
    }

    // Constructor with radius (2nd constructor)
    public Circle(double r){
        radius = r;
        color = "red";
    }

    //* Constructor with radius and color (task 1.1)
    public Circle(double r, String c) {
        radius = r;
        color = c;
    }

    // Returns the radius 
    public double getRadius(){
        return radius;
    }

    // Returns the area of this Circle instance
    public double getArea(){
        return radius*radius*Math.PI;
    }

    //* Getter for color (task 1.1)
    public String getColor() {
        return color;
    }

    //* Setter for color (task 1.1)
    public void setColor(String c) {
        color = c;
    }

    // Return a self-descriptive string of this instance in the form of Circle[radius=?,color=?]
    public String toString() {
        return "\nCircle[radius=" + radius + " color=" + color + "]";
    }  

}