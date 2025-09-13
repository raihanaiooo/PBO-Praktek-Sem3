public class Shape{
    private String color;
    private Boolean filled;

    public Shape(){
        color="Green";
        filled=true;
    }
    
    public Shape(String color, Boolean filled){
        this.color=color;
        this.filled=filled;
    }

    public String getColor(){
        return color;
    }
    public void setColor(String color){
        this.color = color;
    }

    public Boolean isFilled(){
        return filled;
    }
    
    public void setFilled(boolean filled){
        this.filled = filled;
    }

    public String toString(){
        return "A shape with color of "+color+" and "+(filled?"filled":"not filled");
    }
}