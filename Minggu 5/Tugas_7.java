import java.util.Scanner;

public class Tugas_7 {
  public static void main(String[] args) {
    char nilai;
    Scanner input = new Scanner(System.in);

    System.out.print("Input Nilai Anda (A - E): ");
    nilai = input.next().charAt(0);

    switch (nilai) {
      case 'A':
        System.out.println("Istimewa");
        break;
      case 'B':
        System.out.println("Baik");
        break;
      case 'C':
        System.out.println("Cukup");
        break;
      case 'D':
        System.out.println("Kurang");
        break;
      case 'E':
        System.out.println("Kurang sekali");
        break;
      default:
        System.out.println("Nilai tidak sesuai");
    }
  }

}
