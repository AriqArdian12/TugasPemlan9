package Soal_3;

import java.io.File;

public class TampilkanNamaFile {
    public static void main(String[] args) {
        File dir = new File("nama_direktori"); // ganti sesuai path
        if (dir.exists() && dir.isDirectory()) {
            String[] files = dir.list();
            if (files != null) {
                for (String name : files) {
                    System.out.println(name);
                }
            } else {
                System.out.println("Gagal mengambil daftar file.");
            }
        } else {
            System.out.println("Direktori tidak ditemukan.");
        }
    }
}
