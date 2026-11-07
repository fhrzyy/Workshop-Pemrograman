import java.util.Scanner;

public class konversiwaktu {

    public static void main(String[] args) {
        // Deklarasi variabel sesuai struktur data
        int jam;
        int menit;
        int hasil;

        // Inisialisasi Scanner untuk input
        Scanner input = new Scanner(System.in);

        // --- Langkah Sesuai Flowchart: Input jam, menit ---
        System.out.println("--- Konversi Jam dan Menit ke Total Menit ---");

        System.out.print("Masukkan jam: ");
        // Membaca input jam
        jam = input.nextInt();

        System.out.print("Masukkan menit: ");
        // Membaca input menit
        menit = input.nextInt();

        // --- Langkah Tambahan: Percabangan untuk Validasi Input ---
        // Memeriksa apakah input jam dan menit non-negatif
        if (jam >= 0 && menit >= 0) {

            // --- Langkah Sesuai Flowchart: Perhitungan ---
            // hasil = menit + (jam * 60)
            // Konversi jam ke menit dan tambahkan dengan menit yang ada
            hasil = menit + (jam * 60);

            // --- Langkah Sesuai Flowchart: Print hasil (modifikasi untuk detail) ---
            // Output yang diminta pada contoh: 11 jam 7 menit setara dengan 667 menit
            System.out.println("\nOutput:");
            System.out.println(jam + " jam " + menit + " menit setara dengan " + hasil + " menit");

        } else {
            // Blok ini dijalankan jika input jam atau menit negatif (invalid)
            System.out.println("\nERROR: Input jam atau menit tidak boleh negatif. Silakan ulangi.");
        }

    }
}