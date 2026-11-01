import java.util.Scanner;

public class JumlahDanTerbesar {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int bil1, bil2, bil3, bil4, bil5;
        int jumlah, terbesar;

        System.out.print("Masukkan bilangan ke-1: ");
        bil1 = input.nextInt();
        System.out.print("Masukkan bilangan ke-2: ");
        bil2 = input.nextInt();
        System.out.print("Masukkan bilangan ke-3: ");
        bil3 = input.nextInt();
        System.out.print("Masukkan bilangan ke-4: ");
        bil4 = input.nextInt();
        System.out.print("Masukkan bilangan ke-5: ");
        bil5 = input.nextInt();

        jumlah = bil1 + bil2 + bil3 + bil4 + bil5;

        terbesar = bil1;
        if (bil2 > terbesar)
            terbesar = bil2;
        if (bil3 > terbesar)
            terbesar = bil3;
        if (bil4 > terbesar)
            terbesar = bil4;
        if (bil5 > terbesar)
            terbesar = bil5;

        System.out.println("Jumlah kelima bilangan = " + jumlah);
        System.out.println("Bilangan terbesar     = " + terbesar);
    }
}