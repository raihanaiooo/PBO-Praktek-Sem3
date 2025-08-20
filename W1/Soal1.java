import java.util.Scanner;

public class Soal1{
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        
            System.out.println("Enter a number: ");
            
        while (scanner.hasNext()){
            String input = scanner.next();
            try {
                long number = Long.parseLong(input);
                System.out.println(number + " can be fitted in: ");

                if (number >= Byte.MIN_VALUE && number <= Byte.MAX_VALUE) System.out.println("* Byte");
                if (number >= Short.MIN_VALUE && number <= Short.MAX_VALUE) System.out.println("* Short");
                if (number >= Integer.MIN_VALUE && number <= Integer.MAX_VALUE) System.out.println("* Integer");
                if (number >= Long.MIN_VALUE && number <= Long.MAX_VALUE) System.out.println("* Long");
            } catch (NumberFormatException e) {
                System.out.println(input + " can't be fitted anywhere.");
            }
        }
        
        scanner.close();
    }
}