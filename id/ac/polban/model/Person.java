package id.ac.polban.model;

public abstract class Person {
    private static int counter = 1;
    private int id;
    private String name;

    // Konstruktor default (counter id otomatis)
    public Person() {
        this.id = counter++;
    }

    // Konstruktor dengan nama
    public Person(String name) {
        this();
        this.name = name;
    }

    // Getter / Setter
    public int getId() { return id; }
    public String getName() { return name; }
    public void setName(String name) { this.name = name; }

    // Display dasar (dapat di-override oleh subclass)
    public void display() {
        System.out.println("ID: " + id);
        System.out.println("Name: " + name);
    }

    // Input data dasar (dapat di-override)
    public void inputData(java.util.Scanner scanner) {
        System.out.print("Nama: ");
        this.name = scanner.nextLine();
    }
}