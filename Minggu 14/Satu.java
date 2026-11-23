import java.util.Scanner;

public class Satu {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Deklarasi sesuai flowchart: n=8, biner=[n], hasil=0, i
        int n = 8;
        int[] biner = new int[n + 1];   // indeks 1..n agar sama dengan flowchart
        int hasil = 0;
        int i;

        // Input biner (harus tepat 8 digit, hanya 0 dan 1)
        String masukan;
        do {
            System.out.print("Masukkan bilangan biner (8 digit): ");
            masukan = scanner.nextLine().trim();
            if (!masukan.matches("[01]{8}")) {
                System.out.println("Input tidak valid. Masukkan 8 digit 0/1.");
            }
        } while (!masukan.matches("[01]{8}"));

        for (i = 1; i <= n; i++) {
            biner[i] = masukan.charAt(i - 1) - '0';
        }

        // Perulangan: i=n; i>=1; i--
        // hasil += biner[i] * 2^(n-i)
        for (i = n; i >= 1; i--) {
            hasil += biner[i] * (int) Math.pow(2, n - i);
        }

        // Print hasil
        System.out.println("Bilangan desimal : " + hasil);

        scanner.close();
    }
}