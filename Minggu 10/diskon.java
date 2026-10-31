import java.util.Scanner;

public class diskon {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        double totalHarga, diskon, bayar;

        System.out.print("Masukkan total harga pembelian: ");
        totalHarga = input.nextDouble();

        if (totalHarga > 1500000) {
            diskon = totalHarga * 0.10;
        } else {
            diskon = 0;
        }

        bayar = totalHarga - diskon;

        System.out.println("Diskon        : " + diskon);
        System.out.println("Harga dibayar : " + bayar);

        input.close();
    }
}