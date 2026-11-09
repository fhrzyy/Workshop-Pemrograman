import java.util.Scanner;

public class kasus2 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n, i, j;

        System.out.print("Masukkan jumlah tumpukan: ");
        n = in.nextInt();

        for (i = 1; i <= n; i++) {
            for (j = 1; j <= 2 * i - 1; j++) {
                System.out.print(i);
            }
            System.out.println();
        }
    }
}