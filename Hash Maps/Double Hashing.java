
import java.util.Scanner;

public class DoubleHashing {
    private static int calculateDH(int v, int i, int m) {
        int hf1 = v % m;
        int hf2 = 1 + (v % (m - 2));
        return (hf1 + i * hf2) % m;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the value of v: ");
        int v = scanner.nextInt();

        System.out.print("Enter the value of i: ");
        int i = scanner.nextInt();

        int m = 10; // Given value of m = 10

        int result = calculateDH(v, i, m);
        System.out.println("DH(" + v + ", " + i + ") = " + result);

        scanner.close();
    }
}
