package Soal_2;

import java.io.File;
import java.text.DecimalFormat;

public class TampilkanUkuranFile {
    public static void main(String[] args) {
        File file = new File("test.txt");
        if (!file.exists()) {
            System.out.println("File tidak ditemukan.");
            return;
        }
        long bytes = file.length();
        DecimalFormat df = new DecimalFormat("#.##");
        if (bytes < 1_048_576) { // < 1 MB
            double kb = bytes / 1024.0;
            System.out.println("Ukuran file: " + df.format(kb) + " KB");
        } else {
            double mb = bytes / (1024.0 * 1024.0);
            System.out.println("Ukuran file: " + df.format(mb) + " MB");
        }
    }
}

