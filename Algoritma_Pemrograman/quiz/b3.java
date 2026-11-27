import java.util.Scanner;

// Mengubah posisi isi array tanpa membuat array baru
public class b3 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Banyak data (n): ");
        int n = input.nextInt();
        int[] a = new int[n];

        System.out.println("Masukkan " + n + " bilangan bulat: ");
        for (int i = 0; i < n; i++) {
            a[i] = input.nextInt();
        }

        int bantu = a[0];
        for (int i = 0; i < n - 1; i++) {
            a[i] = a[i + 1];
        }
        a[n - 1] = bantu;

        System.out.println("Hasil: ");
        for (int i = 0; i < n; i++){
            System.out.print(a[i] + (i < n - 1 ?  ", " : ""));
        }
        System.out.println();
    }
}