package id.ac.polban.model;

public class Karyawan {
    private static int counter = 1;
    private int id;
    private String name;
    private Departemen departemen;
    private int gaji;

    // Constructor
    public Karyawan() {
        this.id = counter++;
    }

    // Getter
    public int getId() { return id; }
    public String getName(){ return name; }
    public Departemen getDepartemen(){ return departemen; }
    public int getGaji(){ return gaji; }

    // Setter
    public void setName(String newName){ name = newName; }
    public void setDepartemen(Departemen newDepartemen){ departemen = newDepartemen; }
    public void setGaji(int newGaji){ gaji = newGaji; }

    // Display
    public void display() {
        System.out.println("ID: " + id);
        System.out.println("Name: " + name);
        if (departemen != null) {
            System.out.println("Departemen: " + departemen.getName());
            System.out.println("Deskripsi: " + departemen.getDesc());
        }
        System.out.println("Gaji: " + gaji);
        System.out.println("-------------------");
    }

    // Input data
    
    public void inputData(java.util.Scanner scanner) {
        System.out.print("Nama Karyawan: ");
        this.name = scanner.nextLine();
        System.out.print("Gaji: ");
        this.gaji = scanner.nextInt();
        scanner.nextLine();
    }
}
