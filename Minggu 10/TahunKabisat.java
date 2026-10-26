import java.util.Scanner;

public class TahunKabisat {
    public static void main(String[] args) {

        int tahun;

        Scanner input = new Scanner(System.in);

        try {
            System.out.print("Masukkan tahun: ");
            tahun = input.nextInt();

            if (tahun % 4 == 0) {
                System.out.println("Tahun Kabisat");
            } else {
                System.out.println("Bukan Tahun Kabisat");
            }

        } catch (java.util.InputMismatchException e) {
            System.out.println("Input tidak valid harap masukkan angka");
        } finally {
            input.close();
        }

    }
}