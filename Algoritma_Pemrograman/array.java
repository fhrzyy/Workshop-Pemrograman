import java.util.Scanner;

public class array {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Deklerasi array 20 elemen
        double[] nilai = new double[20];

        // Mengisi array sebanyak yang diinginkan
        int jumlah;
        do {
            System.out.print("Masukkan jumlah mahasiswa (maks 20): ");
            jumlah = input.nextInt();
            if (jumlah < 1 || jumlah > 20) {
                System.out.println("Jumlah harus antara 1 sampai 20!");
            }
        } while (jumlah < 1 || jumlah > 20);

        for (int i = 0; i < jumlah; i++) {
            System.out.print("Masukkan nilai mahasiswa ke-" + (i + 1) + ": ");
            nilai[i] = input.nextDouble();
        }

        // Hitung rata rata
        double total = 0;
        for (int i = 0; i < jumlah; i++) {
            total += nilai[i];
        }
        double rataRata = total / jumlah;

        System.out.println("\nRata-rata nilai: " + rataRata);

        // Cari nilai terkecil
        double terkecil = nilai[0];
        for (int i = 1; i < jumlah; i++) {
            if (nilai[i] < terkecil) {
                terkecil = nilai[i];
            }
        }
        System.out.println("Nilai Terkecil: " + terkecil);

    }
}