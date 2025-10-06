public class GoodsTest{
    public static void main(String[] args) {
        Goods apple = new Food("apple",2.0,95);
        Goods lego = new Toy("Lego",50.0,6);
        Goods book = new Book("Java Programming", 30.0, "John");

        apple.display();
        System.out.println();
        lego.display();
        System.out.println();
        book.display();
    }
}


