package id.ac.polban.model;

public class Departemen {
    private static int counter = 1;
    private int id;
    private String name;
    private String desc;

    // Constructor
    public Departemen(){
        this.id = counter++;
    }

    // Getter
    public int getId() { return id; }
    public String getName() { return name; }
    public String getDesc() { return desc; }

    // Setter
    public void setName(String newName){ name = newName; }
    public void setDesc(String newDesc){ desc = newDesc; }

    // Display
    public void display() {
        System.out.println("ID: " + id);
        System.out.println("Name: " + name);
        System.out.println("Deskripsi: " + desc);
        System.out.println("-------------------");
    }

    // Input data
    public void inputData(java.util.Scanner scanner) {
        System.out.print("Nama Departemen: ");
        this.name = scanner.nextLine();
        System.out.print("Deskripsi: ");
        this.desc = scanner.nextLine();
    }
}
