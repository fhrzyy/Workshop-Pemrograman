public class latihan{
    public static void main(String[] args) {
        
        int bil = 10;

        while (bil <= 30) {
            
            if (bil % 2 == 1) {
                if (! (bil == 21 || bil == 27)) {
                System.out.println(bil + " ");                    
                }
            }
            bil++;
        }

    }
}