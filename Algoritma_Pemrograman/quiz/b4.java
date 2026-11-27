import java.util.Scanner;

public class b4 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Banyak data (n): ");
        int n = input.nextInt();
        int[] a = new int[n];

        System.out.println("Masukkan " + n + " bilangan bulat:");
        for (int i = 0; i < n; i++) {
            a[i] = input.nextInt();
        }

        boolean terurut = true;
        int idx = -1;
        int i = 0;
        while (i < n - 1 && terurut) {
            if (a[i] > a[i + 1]) {
                terurut = false;
                idx = i;
            } else {
                i++;
            }
        }

        if (terurut) {
            System.out.println("Array terurut naik");
        } else {
            System.out.println("Array tidak terurut naik; pelanggaran pertama pada indeks " + idx + " dan " + (idx + 1)
                    + " (" + a[idx] + " > " + a[idx + 1] + ")");

        }

    }
}