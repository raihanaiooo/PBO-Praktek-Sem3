import id.ac.polban.model.Departemen;
import id.ac.polban.model.Karyawan;
import id.ac.polban.service.KaryawanService;
import java.util.ArrayList;
import java.util.Scanner;

public class main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<Karyawan> karyawanList = new ArrayList<>();
        ArrayList<Departemen> departemenList = new ArrayList<>();
        KaryawanService service = new KaryawanService();
        int jumlahKaryawan, jumlahDepartemen, pilihDept, pilih;

        do {
            System.out.println("\nSelamat Datang di Aplikasi Manajemen Karyawan!");
            System.out.println("\n1. Tambah Departemen");
            System.out.println("2. Tambah Karyawan");
            System.out.println("3. Lihat Data");
            System.out.println("4. Cetak Slip Gaji");
            System.out.println("5. Keluar");
            System.out.print("Silakan Pilih Menu: ");
            pilih = scanner.nextInt();
            scanner.nextLine();

            switch (pilih) {
                case 1 -> {
                    System.out.print("Masukan jumlah departemen: ");
                    jumlahDepartemen = scanner.nextInt();
                    scanner.nextLine();

                    for (int i = 0; i < jumlahDepartemen; i++) {
                        Departemen departemen = new Departemen();
                        System.out.println("\nDepartemen ke - " + (i + 1));
                        System.out.print("Nama Departemen: ");
                        departemen.setName(scanner.nextLine());
                        System.out.print("Deskripsi: ");
                        departemen.setDesc(scanner.nextLine());
                        departemenList.add(departemen);
                    }
                }
                case 2 -> {
                    System.out.print("Masukan jumlah karyawan: ");
                    jumlahKaryawan = scanner.nextInt();
                    scanner.nextLine();

                    for (int i = 0; i < jumlahKaryawan; i++) {
                        Karyawan karyawan = new Karyawan();
                        System.out.println("\nKaryawan ke - " + (i + 1));
                        System.out.print("Nama Karyawan: ");
                        karyawan.setName(scanner.nextLine());
                        System.out.print("Gaji: ");
                        karyawan.setGaji(scanner.nextInt());
                        scanner.nextLine();

                        // Pilih Departemen
                        System.out.println("Pilih Departemen: ");
                        for (int j = 0; j < departemenList.size(); j++) {
                            System.out.println((j + 1) + ". " + departemenList.get(j).getName());
                        }
                        System.out.print("Masukan nomor departemen: ");
                        pilihDept = scanner.nextInt() - 1;
                        scanner.nextLine();

                        if (pilihDept >= 0 && pilihDept < departemenList.size()) {
                            karyawan.setDepartemen(departemenList.get(pilihDept));
                        }
                        karyawanList.add(karyawan);
                    }
                }
                case 3 -> {
                    System.out.println("========== Data Departemen ==========");
                    for (Departemen departemen : departemenList) {
                        departemen.display();
                    }
                    System.out.println("========== Data Karyawan ==========");
                    for (Karyawan karyawan : karyawanList) {
                        karyawan.display();
                    }
                }
                case 4 -> {
                    System.out.println("Pilih Karyawan untuk Cetak Slip Gaji: ");
                    for (int i = 0; i < karyawanList.size(); i++) {
                        System.out.println((i+1) + ". " + karyawanList.get(i).getName());
                    }
                    int pilihan = scanner.nextInt() - 1;
                    if (pilihan >= 0 && pilihan < karyawanList.size()) {
                        service.cetakSlipGaji(karyawanList.get(pilihan));
                    }
                }
                case 5 -> {
                    System.out.println("Keluar dari program...");
                }
                default -> {
                    System.out.println("Pilihan tidak valid!");
                }
            }
        } while (pilih != 5);

        scanner.close();
    }
}
