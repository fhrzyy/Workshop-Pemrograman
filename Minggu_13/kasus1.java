import java.util.Scanner;
import java.util.Stack;

public class kasus1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        Stack<Character> stack = new Stack<>();
        String str = "";

        System.out.println("---PROGRAM MEMBALIK SESUAI KARAKTER STACK (sesuai flowchart)---");
        System.out.print("Input Kalimat: ");
        String kalimat = scanner.nextLine();

        System.out.println("\nKalimat Awal:\"" + kalimat + "\"");

        char[] kalimatArray = kalimat.toCharArray();

        for (int i = 0; i < kalimatArray.length; i++) {
            stack.push(kalimatArray[i]);

        }

        StringBuilder hasilBalik = new StringBuilder();

        while (!stack.empty()) {

            char karakter = stack.pop();
            str += karakter;

            hasilBalik.append(karakter);
        }

        System.out.println("Output (Semua karakter dibalik): \"" + hasilBalik.toString() + "\"");

    }
}