public class Cylinder extends Circle{
    private double height;

    // Constructor with default color, radius and height
    public Cylinder(){
        super(); // call superclass no-arg constructor Circle()
        height = 1.0;
    }

    // Constructor with default radius, color but given height
    public Cylinder(double height){
        super();
        this.height = height;
    }

    // Constructor with default color, but given radius, height
    public Cylinder(double radius, double height){
        super(radius); // call superclass constructor Circle(r)
        this.height = height;
    }

    // A public method for retrieving the height
    public double getHeight(){
        return height;
    }

    // A public method for computing the volume of cylinder
    // use superclass method getArea() to get the base area
    public double getVolume(){
        return super.getArea() * height;
    }

    //* Task 1.2 
    public double getArea(){
        double baseArea = super.getArea(); // alas lingkaran
        double circumference = 2 * Math.PI * getRadius();
        return 2 * baseArea + circumference * height;
    }

    //* Task 1.3
    public String toString(){
        return "\nCylinder: subclass of "+super.toString() + " height = " + height;
    } 

}