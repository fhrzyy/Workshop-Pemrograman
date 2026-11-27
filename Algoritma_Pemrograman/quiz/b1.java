import java.util.Locale;
import java.util.Scanner;

// Program untuk menampilkan rata rata dan jumlah di atas rata rata
    public class b1{
        public static void main(String[] args) {
            Scanner input = new Scanner(System.in);
            
            System.out.print("Jumlah mahasiswa (n): ");
            int n = input.nextInt();
            int[] nilai = new int[n];

            // Baca nilai sambil menjumlahkan
            int total = 0;
            System.out.println("Masukkan " + n + " nilai ujian:");
            for (int i = 0; i < n; i++){
                nilai[i] = input.nextInt();
                total += nilai[i];
            }

            // Rata rata harus real, salah satu operand di cast ke double
            double rata = (double) total / n;
            
            // Hitung yang nilainya di atas rata rata
            int jumlah = 0;
            for (int i = 0; i < n; i++){
                if (nilai[i] > rata){
                    jumlah++;
                }
            }
            System.out.println(String.format(Locale.US, "Rata-rata: %.2f", rata));
            System.out.println("Jumlah di atas rata rata: " + jumlah);
        }
    }