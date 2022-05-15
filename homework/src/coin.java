import java.util.Scanner;

public class coin {
    public static int find_min(int[] arr, int[] money, int k) {

        for (int i = 1; i <= k; i++) {
            arr[i] = -1;
            for (int j = 0; j < 8; j++) {
                if (money[j] <= i) {
                    if (arr[i - money[j]] < 0) continue;

                    if (arr[i] < 0)
                        arr[i] = arr[i - money[j]] + 1;
                    else if (arr[i - money[j]] + 1 < arr[i]) arr[i] = arr[i - money[j]] + 1;
                }
            }
        }

        return arr[k];
    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int k = scan.nextInt();
        int[] money = new int[]{1, 4, 7, 13, 28, 52, 91, 365};
        int[] arr = new int[k + 1];

        System.out.println(find_min(arr, money, k));

    }
}
