import java.util.Scanner;

public class Determinan {
    public static void main(String[] args) {
        // Deklarasi variabel (a, b, c, D)
        double a, b, c, D;

        Scanner input = new Scanner(System.in);

        // Input a, b, c
        System.out.print("Masukkan a: ");
        a = input.nextDouble();
        System.out.print("Masukkan b: ");
        b = input.nextDouble();
        System.out.print("Masukkan c: ");
        c = input.nextDouble();

        // Cek a == 0 ?
        if (a == 0) {
            System.out.println("a tidak boleh 0");
        } else {
            // Hitung diskriminan
            D = b * b - 4 * a * c;

            if (D == 0) {
                // Akar real kembar
                double x1 = -b / (2 * a);
                double x2 = x1;
                System.out.println("Akar real kembar");
                System.out.println("x1 = " + x1);
                System.out.println("x2 = " + x2);
            } else if (D > 0) {
                // Akar real berlainan
                double x1 = (-b + Math.sqrt(D)) / (2 * a);
                double x2 = (-b - Math.sqrt(D)) / (2 * a);
                System.out.println("Akar real berlainan");
                System.out.println("x1 = " + x1);
                System.out.println("x2 = " + x2);
            } else {
                // D < 0 : akar imajiner
                double real = -b / (2 * a);
                double imaj = Math.sqrt(-D) / (2 * a);
                System.out.println("Akar imajiner");
                System.out.println("x1 = " + real + " + " + imaj + " i");
                System.out.println("x2 = " + real + " - " + imaj + " i");
            }
        }

        input.close();
    }
}