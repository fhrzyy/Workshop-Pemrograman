import java.util.Scanner;

public class kasus1Array {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("---PROGRAM MEMBALIK KALIMAT DENGAN STACK (ARRAY OF CHARACTER)---");
        System.out.print("Input Kalimat: ");
        String kalimat = scanner.nextLine();

        System.out.println("\nKalimat Awal: \"" + kalimat + "\"");

        // Stack berupa array of character
        char[] stack = new char[kalimat.length()];
        int top = -1; // -1 artinya stack kosong

        // PUSH: masukkan setiap karakter ke stack
        for (int i = 0; i < kalimat.length(); i++) {
            top++;
            stack[top] = kalimat.charAt(i);
        }

        // POP: ambil karakter dari atas stack sampai kosong
        StringBuilder hasilBalik = new StringBuilder();
        while (top >= 0) {
            char karakter = stack[top];
            top--;
            hasilBalik.append(karakter);
        }

        System.out.println("Output (Semua karakter dibalik): \"" + hasilBalik.toString() + "\"");
    }
}