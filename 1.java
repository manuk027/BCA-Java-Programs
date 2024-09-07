import java.util.Scanner;

public class Fibonacci {
    public static void main(String[] args) {
        int a = 0, b = 1, c, n;
        System.out.println("Enter the limit:");
        Scanner s = new Scanner(System.in);
        n = s.nextInt();
        System.out.println("Fibonacci numbers up to " + n + ":");

        if (n <= 0) {
            System.out.println(a);
        } else {
            System.out.print(a + "\n" + b + "\n");
            for (c = a + b; c <= n; c = a + b) {
                System.out.print(c + "\n");
                a = b;
                b = c;
            }
        }
        s.close();
    }
}
