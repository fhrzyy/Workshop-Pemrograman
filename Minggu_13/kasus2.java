import java.util.Scanner;
import java.util.Stack;

public class kasus2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // bil, satuan=1
        // stack, nilai, hasil=0
        int bil;
        int satuan = 1;
        Stack<Integer> stack = new Stack<>();
        int nilai;
        int hasil = 0;

        // Input bil
        System.out.print("Input bil: ");
        bil = scanner.nextInt();

        // Loop memasukkan digit ke stack (sampai bil = 0)
        do {
            nilai = bil % 10;
            bil = bil / 10;
            stack.push(nilai);
        } while (bil != 0);

        // Loop mengambil digit dari stack (selama stack tidak kosong)
        while (!stack.empty()) {
            nilai = stack.pop();
            hasil = hasil + nilai * satuan;
            satuan *= 10;
        }

        // Print hasil
        System.out.println("Hasil: " + hasil);
    }
}