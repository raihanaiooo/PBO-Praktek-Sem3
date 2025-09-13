public class TestCircle{
    public static void main(String[] args) {
        Circle c1 = new Circle(2.0, "Blue");
        System.out.println(c1.toString());
        System.out.println("Old Color: "+c1.getColor());

        c1.setColor("Green");
        System.out.println(c1.toString());
        System.out.println("Updated Color: "+c1.getColor());
    }
}