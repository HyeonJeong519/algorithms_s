import java.util.*;

public class pancake {

    public static void flip(int arr[], int n, int[] reverse) {
        int max = 0;
        int tmp;
        for (int i = 1; i < n; i++) {
            if (arr[max] < arr[i]) {
                max = i;
            }
        }
        if (max != 0) {
            tmp = arr[max];
            arr[max] = arr[0];
            arr[0] = tmp;
        }
        for (int i = n - 1, j = 0; j < n; i--, j++)
            reverse[j] = arr[i];

        if (n > 0)
            flip(reverse, n - 1, reverse);
    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        int[] arr = new int[n];
        int[] reverse = new int[n];
        for (int i = 0; i < n; i++)
            arr[i] = scan.nextInt();
        flip(arr, n, reverse);
        for (int i = 0; i < n; i++)
            System.out.println(reverse[i]);
    }
}
