public class BilanganGanjil {
    public static void main(String[] args) {
        // Inisialisasi variabel Bil dengan nilai awal 10 sesuai flowchart
        int bil = 10;

        // Perulangan untuk mengecek bilangan dari 10 sampai 30 (Bil <= 30)
        while (bil <= 30) {
            // Mengecek apakah bilangan tersebut adalah bilangan ganjil (bil % 2 == 1)
            if (bil % 2 == 1) {
                // Mengecek apakah bilangan tersebut BUKAN 21 dan BUKAN 27
                if (!(bil == 21 || bil == 27)) {
                    // Menampilkan bilangan ke layar jika memenuhi syarat
                    System.out.print(bil + " ");
                }
            }
            // Increment nilai bil (Bil++) untuk melanjutkan iterasi berikutnya
            bil++;
        }
    }
}