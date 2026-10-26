public class four {
    public static void main(String[] args) {
        System.out.println("Sebelum for");
        for (int a = 0; a < 10; a++) {
            if (a == 4)
                break;
            System.out.println("Nilai a : " + a);
        }
        System.out.println("Setelah for");
    }
}
