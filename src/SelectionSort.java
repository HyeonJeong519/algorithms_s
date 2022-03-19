import java.util.Scanner;

public class SelectionSort {
    public static void sort(int[] arr, int n) {
        int min, i, j, tmp;
        for (i = 0; i < n - 1; i++) {
            min = i;
            for (j = i + 1; j < n; j++) {
                if (arr[j] < arr[min])
                    min = j;
            }
            tmp = arr[min];
            arr[min] = arr[i];
            arr[i] = tmp;
        }
    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        int[] x = new int[n];
        for (int i = 0; i < n; i++)
            x[i] = scan.nextInt();

        sort(x, n);

        for (int i = 0; i < n; i++)
            System.out.println(x[i]);
    }
}
