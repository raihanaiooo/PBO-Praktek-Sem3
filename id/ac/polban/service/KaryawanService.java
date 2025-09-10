package id.ac.polban.service;

import id.ac.polban.model.Departemen;
import id.ac.polban.model.Karyawan;
import java.util.ArrayList;
import java.util.Scanner;

public class KaryawanService {

    // Case 1: Tambah Departemen
    public void tambahDepartemen(Scanner scanner, ArrayList<Departemen> departemenList) {
        System.out.print("Masukan jumlah departemen: ");
        int jumlahDepartemen = scanner.nextInt();
        scanner.nextLine();

        for (int i = 0; i < jumlahDepartemen; i++) {
            Departemen departemen = new Departemen();
            System.out.println("\nDepartemen ke - " + (i + 1));
            departemen.inputData(scanner);
            departemenList.add(departemen);
        }
    }

    // Case 2: Tambah Karyawan
    public void tambahKaryawan(Scanner scanner, ArrayList<Karyawan> karyawanList, ArrayList<Departemen> departemenList) {
        if (departemenList.isEmpty()) {
            System.out.println("⚠ Belum ada departemen. Tambahkan departemen terlebih dahulu!");
            return;
        }

        System.out.print("Masukan jumlah karyawan: ");
        int jumlahKaryawan = scanner.nextInt();
        scanner.nextLine();

        for (int i = 0; i < jumlahKaryawan; i++) {
            Karyawan karyawan = new Karyawan();
            System.out.println("\nKaryawan ke - " + (i + 1));
            karyawan.inputData(scanner);

            // Pilih Departemen
            System.out.println("Pilih Departemen: ");
            for (int j = 0; j < departemenList.size(); j++) {
                System.out.println((j + 1) + ". " + departemenList.get(j).getName());
            }
            System.out.print("Masukan nomor departemen: ");
            int pilihDept = scanner.nextInt() - 1;
            scanner.nextLine();

            if (pilihDept >= 0 && pilihDept < departemenList.size()) {
                karyawan.setDepartemen(departemenList.get(pilihDept));
            } else {
                System.out.println("Departemen tidak valid. Karyawan tidak diberi departemen.");
            }

            karyawanList.add(karyawan);
        }
    }

    // Case 3: Tampilkan Data
    public void tampilkanData(ArrayList<Karyawan> karyawanList, ArrayList<Departemen> departemenList) {
        System.out.println("========== Data Departemen ==========");
        for (Departemen departemen : departemenList) {
            departemen.display();
        }
        System.out.println("========== Data Karyawan ==========");
        for (Karyawan karyawan : karyawanList) {
            karyawan.display();
        }
    }

    // Case 4: Cetak Slip Gaji
    public void cetakSlipGajiMenu(Scanner scanner, ArrayList<Karyawan> karyawanList) {
        if (karyawanList.isEmpty()) {
            System.out.println("⚠ Belum ada karyawan untuk dicetak slip gaji.");
            return;
        }

        System.out.println("Pilih Karyawan untuk Cetak Slip Gaji: ");
        for (int i = 0; i < karyawanList.size(); i++) {
            System.out.println((i + 1) + ". " + karyawanList.get(i).getName());
        }
        int pilihan = scanner.nextInt() - 1;
        if (pilihan >= 0 && pilihan < karyawanList.size()) {
            cetakSlipGaji(karyawanList.get(pilihan));
        } else {
            System.out.println("Pilihan tidak valid!");
        }
    }

    // Cetak slip gaji untuk 1 karyawan
    public void cetakSlipGaji(Karyawan karyawan) {
        System.out.println("Slip Gaji untuk " + karyawan.getName());
        System.out.println("Departemen: " + (karyawan.getDepartemen() != null ? karyawan.getDepartemen().getName() : "-"));
        System.out.println("Gaji: " + karyawan.getGaji());
        System.out.println("=======================");
    }
}
