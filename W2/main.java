import id.ac.polban.model.Departemen;
import id.ac.polban.model.Karyawan;
import id.ac.polban.service.KaryawanService;
import java.util.ArrayList;
import java.util.Scanner;

public class main {
    private static final Scanner scanner = new Scanner(System.in);
    private static final ArrayList<Karyawan> karyawanList = new ArrayList<>();
    private static final ArrayList<Departemen> departemenList = new ArrayList<>();
    private static final KaryawanService service = new KaryawanService();

    public static void main(String[] args) {
        int pilih;
        do {
            System.out.println("\nSelamat Datang di Aplikasi Manajemen Karyawan!");
            System.out.println("1. Tambah Departemen");
            System.out.println("2. Tambah Karyawan");
            System.out.println("3. Lihat Data");
            System.out.println("4. Cetak Slip Gaji");
            System.out.println("5. Keluar");
            System.out.print("Silakan Pilih Menu: ");
            pilih = scanner.nextInt();
            scanner.nextLine();

            switch (pilih) {
                case 1 -> tambahDepartemen();
                case 2 -> tambahKaryawan();
                case 3 -> tampilkanData();
                case 4 -> cetakSlipGaji();
                case 5 -> System.out.println("Keluar dari program...");
                default -> System.out.println("Pilihan tidak valid!");
            }
        } while (pilih != 5);

        scanner.close();
    }

    // Wrapper method untuk memanggil service
    private static void tambahDepartemen() {
        service.tambahDepartemen(scanner, departemenList);
    }

    private static void tambahKaryawan() {
        service.tambahKaryawan(scanner, karyawanList, departemenList);
    }

    private static void tampilkanData() {
        service.tampilkanData(karyawanList, departemenList);
    }

    private static void cetakSlipGaji() {
        service.cetakSlipGajiMenu(scanner, karyawanList);
    }
}
