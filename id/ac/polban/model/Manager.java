package id.ac.polban.model;

public class Manager extends Karyawan {
    private int tunjangan;

    public Manager() {
        super();
    }

    public Manager(String name, Departemen departemen, int gaji, int tunjangan) {
        super(name, departemen, gaji);
        this.tunjangan = tunjangan;
    }

    public int getTunjangan() { return tunjangan; }
    public void setTunjangan(int tunjangan) { this.tunjangan = tunjangan; }

    // Override display
    @Override
    public void display() {
        super.display();
        System.out.println("Tunjangan: " + tunjangan);
        System.out.println("-------------------");
    }

    // Override inputData
    @Override
    public void inputData(java.util.Scanner scanner) {
        super.inputData(scanner); // input nama & gaji dari Karyawan
        System.out.print("Tunjangan: ");
        this.tunjangan = scanner.nextInt();
        scanner.nextLine();
    }

    // Override getGaji
    @Override
    public int getGaji() {
        return super.getGaji() + tunjangan;
    }
}