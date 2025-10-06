import java.util.Scanner;


public class Strings {
    public static void main(String[] args) {
        String[] strList;
        int size;

        Scanner scan = new Scanner(System.in);

        System.out.println("\nHow many strings do you want to sort? ");
        size = scan.nextInt();
        scan.nextLine();
        strList = new String[size];

        System.out.println("\nEnter the strings...");
        for(int i = 0; i<size; i++){
            strList[i] = scan.nextLine();
        }

        // Sorting.selectionSort(strList);
        Sorting.insertionSort(strList);

        System.out.println("\nYour strings in sorted order...");
        for(int i = 0; i < size; i++){
            System.out.println(strList[i] + " ");
        }
        System.out.println();

        scan.close();
    }
}