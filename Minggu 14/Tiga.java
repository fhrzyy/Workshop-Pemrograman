import java.util.Scanner;
import java.util.Stack;

public class Tiga {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Deklarasi sesuai flowchart: bil, nilai, i, bit[1..8], stack
        int bil, nilai, i;
        int[] bit = new int[9];          // indeks 1..8 agar sama dengan flowchart
        Stack<Integer> stack = new Stack<>();

        // Input bil; jika bil < -127 || bil >= 0 (Ya) kembali ke input
        do {
            System.out.print("Masukkan bilangan desimal (-127 s/d -1): ");
            bil = scanner.nextInt();
            if (bil < -127 || bil >= 0) {
                System.out.println("Bilangan harus antara -127 dan -1.");
            }
        } while (bil < -127 || bil >= 0);

        // nilai = -bil ; bit[1] = 1 (sign bit)
        nilai = -bil;
        bit[1] = 1;

        // i=1; i<=7; i++ -> stack.push(nilai%2); nilai=nilai/2
        for (i = 1; i <= 7; i++) {
            stack.push(nilai % 2);
            nilai = nilai / 2;
        }

        // i=2; i<=8; i++ -> bit[i] = stack.pop()
        for (i = 2; i <= 8; i++) {
            bit[i] = stack.pop();
        }

        // i=2; i<=8; i++ -> bit[i] = 1 - bit[i]  (balik bit)
        for (i = 2; i <= 8; i++) {
            bit[i] = 1 - bit[i];
        }

        // i=8; i>=2; i-- -> tambah 1
        // jika bit[i]==1 -> bit[i]=0 lalu lanjut ke kiri (carry)
        // jika tidak     -> bit[i]=1 lalu selesai
        for (i = 8; i >= 2; i--) {
            if (bit[i] == 1) {
                bit[i] = 0;
            } else {
                bit[i] = 1;
                break;
            }
        }

        // i=1; i<=8; i++ -> Print bit[i]
        System.out.print("Bilangan biner : ");
        for (i = 1; i <= 8; i++) {
            System.out.print(bit[i]);
        }
        System.out.println();

        scanner.close();
    }
}