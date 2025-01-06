import java.util.Scanner;

public class Problem03 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number: ");
        long n = sc.nextLong();
        factor(n);
    }
    public static long factor(long n) {
        long i = 2;
        while (i <= n) {
            if (n % i == 0) {
                System.out.println(i);
                n = n / i;
            } else {
                i++;
            }
        }
        return i;
    }
}
