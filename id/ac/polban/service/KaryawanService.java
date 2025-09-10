package id.ac.polban.service;

import id.ac.polban.model.Karyawan;

public class KaryawanService {
    // Dependency: hanya menggunakan objek Karyawan sementara
    public void cetakSlipGaji(Karyawan karyawan) {
        System.out.println("Slip Gaji untuk " + karyawan.getName());
        System.out.println("Gaji: " + karyawan.getGaji());
        System.out.println("=======================");
    }
}
