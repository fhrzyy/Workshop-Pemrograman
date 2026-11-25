import java.util.Scanner;

// Program untuk mencari nilai terbesar kedua (mencari nilai tertentu tanpa mengurutkan array.)
public class b2 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Banyak data (n >= 1): ");
        int n = input.nextInt();
        int[] a = new int[n];

        System.out.println("Masukkan " + n + " bilangan bulat: ");
        for (int i = 0; i < n; i++) {
            a[i] = input.nextInt();
        }

        // Tahap 1: cari nilai terbesar
        int maks = a[0];
        for (int i = 1; i < n; i++) {
            if (a[i] > maks) {
                maks = a[i];
            }
        }

        // Tahap 2: cari yang terbesar di antara nilai yang berbeda dari maks
        boolean ada = false;
        int kedua = 0;
        for (int i = 0; i < n; i++) {
            if (a[i] != maks) {
                if (!ada || a[i] > kedua) {
                    kedua = a[i];
                    ada = true;
                }
            }
        }
        if (ada) {
            System.out.println(kedua);
        } else {
            System.out.println("Tidak ada nilai terbesar kedua");
        }

    }
}