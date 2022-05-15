import java.util.Scanner;

public class BJ_9095 {
    public static int recursion(int n) {
        if (n == 1) return 1;
        if (n == 2) return 2;
        if (n == 3) return 4;
        else return recursion(n - 3) + recursion(n - 2) + recursion(n - 1);
    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int n = scan.nextInt();

        System.out.println(recursion(n));
    }
}
