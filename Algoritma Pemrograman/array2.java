import java.util.Scanner;

public class NilaiMahasiswa {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Masukkan jumlah mahasiswa: ");
        int jumlah = input.nextInt();

        double[] nilai = new double[jumlah];

        for (int i = 0; i < jumlah; i++) {
            System.out.print("Masukkan nilai mahasiswa ke-" + (i + 1) + ": ");
            nilai[i] = input.nextDouble();
        }

        double total = 0;
        double terkecil = nilai[0];
        for (int i = 0; i < jumlah; i++) {
            total += nilai[i];
            if (nilai[i] < terkecil) {
                terkecil = nilai[i];
            }
        }

        System.out.println("\nRata-rata nilai: " + (total / jumlah));
        System.out.println("Nilai terkecil: " + terkecil);

    }
}