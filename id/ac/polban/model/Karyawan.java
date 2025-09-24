package id.ac.polban.model;

public class Karyawan extends Person {
    private Departemen departemen;
    private int gaji;

    // Konstruktor default memanggil super()
    public Karyawan() {
        super();
    }

    // Konstruktor dengan parameter
    public Karyawan(String name, Departemen departemen, int gaji) {
        super(name);
        this.departemen = departemen;
        this.gaji = gaji;
    }

    // Getter / Setter
    public Departemen getDepartemen() { return departemen; }
    public int getGaji() { return gaji; }
    public void setDepartemen(Departemen departemen) { this.departemen = departemen; }
    public void setGaji(int gaji) { this.gaji = gaji; }

    // Override display
    @Override
    public void display() {
        super.display();
        if (departemen != null) {
            System.out.println("Departemen: " + departemen.getName());
            System.out.println("Deskripsi: " + departemen.getDesc());
        }
        System.out.println("Gaji: " + gaji);
        System.out.println("-------------------");
    }

    // Override inputData
    @Override
    public void inputData(java.util.Scanner scanner) {
        super.inputData(scanner);
        System.out.print("Gaji: ");
        this.gaji = scanner.nextInt();
        scanner.nextLine();
    }
}