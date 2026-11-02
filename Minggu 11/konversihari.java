import java.util.Scanner;

public class konversihari {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Masukkan jumlah detik: ");
        int totalDetik = input.nextInt();

        if (totalDetik < 0) {
            System.out.println("Jumlah detik tidak boleh negatif.");
        } else {
            int hari = totalDetik / 86400;           // 1 hari = 86400 detik
            int sisa = totalDetik % 86400;

            int jam = sisa / 3600;                   // 1 jam = 3600 detik
            sisa = sisa % 3600;

            int menit = sisa / 60;                   // 1 menit = 60 detik
            int detik = sisa % 60;

            System.out.println(totalDetik + " detik sama dengan:");
            System.out.println(hari + " hari");
            System.out.println(jam + " jam");
            System.out.println(menit + " menit");
            System.out.println(detik + " detik");
        }
    }
}