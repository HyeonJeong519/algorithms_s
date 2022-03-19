import java.util.Scanner;

public class sumAll {
    public static int sum(int[] arr, int n) {
        if (n == 1) {
            return arr[n] + arr[n - 1];
        } else return arr[n] + sum(arr, n - 1);
    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++)
            arr[i] = scan.nextInt();
        int y = sum(arr, n - 1);
        System.out.println(y);
    }
}
