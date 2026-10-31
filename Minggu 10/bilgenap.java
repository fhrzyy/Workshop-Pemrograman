public class bilgenap {
    public static void main(String[] args) {
        int Bil = 2, n = 5, i = 1;

        while (true) {
            if (Bil % 2 == 0) {
                if (Bil % 4 != 0) {
                    System.out.println(Bil);
                    i++;
                    if (i > n) {
                        break;
                    }
                }
            }
            Bil++;
        }
    }
}