import java.util.Scanner;

public class Suhu {
    public static void main(String[] args) {

        double celcius, fahrenheit;
        
        // Membuat objek Scanner untuk mendapatkan input dari pengguna
        Scanner input = new Scanner(System.in);
        
        try {
            // Meminta pengguna untuk memasukkan suhu dalam Celcius
            System.out.print("Masukkan suhu dalam satuan Celcius: ");
            celcius = input.nextDouble();
            
            // Menghitung suhu dalam Fahrenheit menggunakan rumus: F = C * 1.8 + 32
            fahrenheit = celcius * 1.8 + 32;
            
            // Menampilkan hasil konversi
            System.out.printf("Suhu dalam satuan Fahrenheit: %.2f%n", fahrenheit);
            
        } catch (java.util.InputMismatchException e) {
            // Menangani kasus jika input yang dimasukkan bukan angka
            System.out.println("Input tidak valid. Harap masukkan angka.");
        } finally {
            // Menutup objek Scanner untuk menghindari kebocoran sumber daya
            input.close();
        }
    }
}