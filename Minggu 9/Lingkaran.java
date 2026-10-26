import java.util.Scanner;

public class Lingkaran {
    public static void main(String[] args) {

        // Mendefinisikan konstanta PI menggunakan 'final'
        final double PI = 3.14;

        // Mendeklarasikan variabel untuk jari-jari, luas, dan keliling
        double radius, luas, keliling;

        // Membuat objek Scanner untuk mendapatkan input dari pengguna
        Scanner input = new Scanner(System.in);

        try {
            // Meminta pengguna untuk memasukkan panjang jari-jari
            System.out.print("Masukkan panjang jari-jari: ");
            radius = input.nextDouble();

            // Menghitung luas lingkaran
            luas = PI * radius * radius;

            // Menghitung keliling lingkaran
            keliling = 2 * PI * radius;

            // Menampilkan hasil dengan format 2 desimal
            System.out.printf("Luas lingkaran: %.2f%n", luas);
            System.out.printf("Keliling lingkaran: %.2f%n", keliling);

        } catch (java.util.InputMismatchException e) {
            // Menangani kasus jika input yang dimasukkan bukan angka
            System.out.println("Input tidak valid. Harap masukkan angka.");
        } finally {
            // Menutup objek Scanner untuk menghindari kebocoran sumber daya
            input.close();
        }

    }
}