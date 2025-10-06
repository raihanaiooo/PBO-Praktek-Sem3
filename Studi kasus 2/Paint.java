public class Paint{
    private double coverage;

    public Paint(double c){
        coverage = c;
    }

    public double amount(Shape s){
        System.out.println("Computing amount fot "+s);
        return s.area();
    }
}