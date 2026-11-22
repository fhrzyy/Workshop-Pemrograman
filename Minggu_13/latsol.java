import java.util.Scanner;
import java.util.Stack;

public class latsol {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        Stack<Character> stack = new Stack<>();

        System.out.print("Masukkan kalimat = ");
        String kalimat = scanner.nextLine();

        String bersih = kalimat.replace(" ", " ").toLowerCase();

        for (int i = 0; i < bersih.length(); i++) {
            stack.push(bersih.charAt(i));
        }

        boolean palindrom = true;
        int i = 0;
        while (!stack.empty()) {
            char karakter = stack.pop();
            if (karakter != bersih.charAt(i)) {
                palindrom = false;
                break;
            }
            i++;
        }

        if (palindrom) {

            System.out.println("Kalimat tersebut adalah palindrom");
        } else {
            System.out.println("Kalimat tersebut bukan palindrom");
        }

    }
}
