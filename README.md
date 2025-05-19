# TugasPemlan9
Tugas 9: Modul Bab Operasi File

Tugas Praktikum
1. Jalankan kode TulisFile1.java beberapa kali dan amati yang terjadi pada file yang
ditulis. Kemudian, Pada baris 13, ubah parameter false menjadi true. Kemudian
jalankan kode tersebut beberapa kali dan amati yang terjadi pada file yang ditulis.
2. Buat kode program untuk mendapatkan ukuran file dalam satuan KB jika ukuran
file tersebut < 1 MB dan dalam satuan MB jika ukuran file tersebut >= 1 MB.

3. Buat kode program untuk menampilkan nama dari semua file yang ada di dalam
suatu direktori. Petunjuk: gunakan perulangan dan method list() atau
listFiles().
4. Buat kode program untuk menghapus suatu direktori beserta semua file yang ada
di dalamnya. Asumsi: di dalam direktori tersebut, hanya ada file-file saja, tidak ada
subdirektori.
5. Apakah yang salah dengan statement berikut? Berikan penjelasan.
var file = new File(“C:\Data\Java\teks.txt”);
6. Apa yang akan terjadi jika kita mencoba untuk membaca isi dari suatu file tetapi
file tersebut tidak ada dan kita tidak melakukan pengecekan lebih dulu?

Jawaban :
1. Jadi pada saat kode pada baris ke 13, Ketika parameter false digunakan hanya menyimpan 1 data saja dan Ketika kita ingin menginput data yang baru, maka data yang sebelumnya akan hilang dan digantikan oleh data yang baru. Dan jika parameter di ganti dengan true maka semua data dapat di simpan dengan data yang sebelumnya

2. jawaban no 2 diatas
   
3. jawaban no 3 diatas

4. jawaban no 4 diatas

5. jika menggunakan statement var file = new File(“C:\Data\Java\teks.txt”); tersebut maka akan menghasilkan error yaitu : Invalid escape sequence (valid ones are  \b  \t  \n  \f  \r  \"  \'  \\ ) Maka harus mengubahnya menjadi var file = new File("C:\\Data\\Java\\teks.txt"); Alasan mengapa bisa error: Karena Di Java , karakter backslash (\) digunakan sebagai escape character, sedangkan backslash sebenarnya adalah : \\

6. Jika langsung membuat new FileReader("namaFile") atau Files.readAllLines(...) tanpa cek exists(), maka akan terjadi. FileNotFoundException (turunan dari IOException). Dan Program akan men-throw exception dan, jika tidak ditangkap (catch), aplikasi akan crash dan stack trace muncul.
