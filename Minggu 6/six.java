public class six {
    public static void main(String[] args) {
        int baris = 8;

        for (int i = 1; i <= baris; i++) {

            for (int j = 1; j <= baris - i; j++) {
                System.out.print(" ");
            }

            for (int k = 1; k <= (2 * i - 1); k++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}