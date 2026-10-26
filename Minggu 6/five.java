public class five {
    public static void main(String[] args) {
        System.out.println("Sebelum for");
        for (int b = 1; b < 3; b++) {
            
            System.out.println("Perulangan ke " + b);
            
            for (int c = 0; c < 5; c++) {
                if (c == 2)
                    break;
                System.out.println("Nilai c : " + c);
            }
        }
        System.out.println("Setelah for");
    }
}
