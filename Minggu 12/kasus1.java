import java.util.Scanner;

public class kasus1 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int bil1, bil2;
        char op;
        float hasil = 0;
        boolean valid = true;

        System.out.print("Masukkan bilangan 1: ");
        bil1 = in.nextInt();
        System.out.print("Masukkan bilangan 2: ");
        bil2 = in.nextInt();
        System.out.print("Masukkan operator: ");
        op = in.next().charAt(0);

        switch (op) {
            case '+':
                hasil = bil1 + bil2;
                break;
            case '-':
                hasil = bil1 - bil2;
                break;
            case '*':
                hasil = bil1 * bil2;
                break;
            case '/':
                if (bil2 == 0) {
                    valid = false;
                    System.out.println("Error: tidak bisa dibagi nol");
                } else {
                    hasil = (float) bil1 / bil2;
                }
                break;
            default:
                valid = false;
                System.out.println("Operator tidak valid");
        }

        if (valid) {
            String teks = (hasil == (int) hasil)
                    ? String.valueOf((int) hasil)
                    : String.valueOf(hasil);
            System.out.println("Hasilnya dari " + bil1 + " " + op
                    + " " + bil2 + " adalah " + teks);
        }
    }
}