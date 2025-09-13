public class TestShape{
    public static void main(String[] args) {
        
        // Kumpulan objek
        Shape s1 = new Shape("Blue",true);
        Circle2 c1 = new Circle2(5.0, "Red", false);
        Rectangle r1 = new Rectangle(4.0,6.0,"Yellow",true);
        Square sq1 = new Square(3.0, "Purple", false);

        System.out.println("=== Info Shape ===");
        System.out.println(s1.toString());

        System.out.println("\n=== Info Circle ===");
        System.out.println(c1.toString());
        System.out.println("Radius   : " + c1.getRadius());
        System.out.println("Area     : " + c1.getArea());
        System.out.println("Perimeter: " + c1.getPerimeter());

        System.out.println("\n=== Info Rectangle ===");
        System.out.println(r1.toString());
        System.out.println("Width    : " + r1.getWidth());
        System.out.println("Length   : " + r1.getLength());
        System.out.println("Area     : " + r1.getArea());
        System.out.println("Perimeter: " + r1.getPerimeter());

        System.out.println("\n=== Info Square ===");
        System.out.println(sq1.toString());
        System.out.println("Side     : " + sq1.getSide());
        System.out.println("Area     : " + sq1.getArea());
        System.out.println("Perimeter: " + sq1.getPerimeter());
    }
}