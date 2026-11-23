import java.util.Scanner;
import java.util.Stack;

public class Dua {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Deklarasi sesuai flowchart: bil, sisa, stack
        int bil, sisa;
        Stack<Integer> stack = new Stack<>();

        // Input bil; jika bil>255 (Ya) kembali ke input
        // (bil negatif ikut ditolak sebagai pengaman tambahan)
        do {
            System.out.print("Masukkan bilangan desimal (0-255): ");
            bil = scanner.nextInt();
            if (bil > 255 || bil < 0) {
                System.out.println("Bilangan harus 0 sampai 255.");
            }
        } while (bil > 255 || bil < 0);

        // Proses: sisa=bil%2; bil=bil/2; push(sisa); ulangi selama bil>0
        do {
            sisa = bil % 2;
            bil = bil / 2;
            stack.push(sisa);
        } while (bil > 0);

        // Output: selama !stack.empty -> sisa=stack.pop; Print sisa
        System.out.print("Bilangan biner : ");
        while (!stack.empty()) {
            sisa = stack.pop();
            System.out.print(sisa);
        }
        System.out.println();

        scanner.close();
    }
}