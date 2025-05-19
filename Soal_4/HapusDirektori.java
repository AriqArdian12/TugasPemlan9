package Soal_4;

import java.io.File;

public class HapusDirektori {
    public static void main(String[] args) {
        File dir = new File("nama_direktori"); // ganti sesuai path
        if (dir.exists() && dir.isDirectory()) {
            File[] files = dir.listFiles();
            if (files != null) {
                for (File f : files) {
                    if (f.isFile()) {
                        if (!f.delete()) {
                            System.err.println("Gagal menghapus: " + f.getName());
                        }
                    }
                }
                // Setelah semua file dihapus, hapus direktori itu sendiri (opsional):
                if (dir.delete()) {
                    System.out.println("Direktori dan isinya berhasil dihapus.");
                } else {
                    System.out.println("Direktori kosong tetapi gagal dihapus.");
                }
            }
        } else {
            System.out.println("Direktori tidak ada atau bukan direktori.");
        }
    }
}
