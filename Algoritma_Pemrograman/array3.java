import java.util.Scanner;

public class NilaiMahasiswa {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // 1. Deklarasi array 20 elemen
        int[] nilai = new int[20];
        int total = 0;
        int JumlahMhs;

        // 2. Mengisi array sebanyak yang diinginkan (maksimal 20)
        do {
            System.out.print("Masukkan Jumlah mahasiswa: ");
            JumlahMhs = input.nextInt();
        } while (JumlahMhs < 1 || JumlahMhs > 20);

        for (int i = 0; i < JumlahMhs; i++) {
            System.out.print("Nilai mahasiswa ke-" + (i + 1) + ": ");
            nilai[i] = input.nextInt();
            total += nilai[i]; // jumlahkan sambil mengisi
        }

        // 3 & 4. Menghitung dan menampilkan rata-rata
        double rata = (double) total / JumlahMhs;
        System.out.println("Rata-rata nilai : " + rata);

        // 5. Mencari nilai terkecil
        int min = nilai[0];
        for (int i = 1; i < JumlahMhs; i++) {
            if (nilai[i] < min) {
                min = nilai[i];
            }
        }
        System.out.println("Nilai terkecil  : " + min);
    }
}