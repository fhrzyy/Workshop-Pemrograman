import java.util.Scanner;
import java.util.Stack;

public class kasus2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int bil;
        int satuan = 1;
        Stack<Integer> stack = new Stack<>();
        int nilai;
        int hasil = 0;

        System.out.println("Input bil: ");
        bil = scanner.nextInt();

        do {
            nilai = bil % 10;
            bil = bil / 10;
            stack.push(nilai);
        } while (bil != 0);

        while (!stack.empty()) {
            nilai = stack.pop();
            hasil = hasil + nilai * satuan;
            satuan *= 10;
        }
        System.out.println("Hasil: " + hasil);

    }
}