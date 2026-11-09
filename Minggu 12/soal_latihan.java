import java.util.Scanner;

public class soal_latihan {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n, i, jumlah = 0;

        System.out.print("Masukkan jumlah triangular: ");
        n = in.nextInt();

        for (i = 1; i <= n; i++) {
            jumlah = jumlah + i;
        }

        System.out.println("Jumlah bola : " + jumlah);
    }
}