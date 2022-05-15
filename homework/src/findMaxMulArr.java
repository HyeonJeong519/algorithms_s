import java.util.Scanner;

public class findMaxMulArr {
    public static int MaxMul(int[] arr, int n,int[] dp) {
        int result =0;

        for (int i = 0; i < n; i++) {
            int tmp = arr[i];
            dp[i] = Math.max(dp[i],tmp);
            for (int j = i+1;j<n;j++){
                tmp *= arr[j];
                dp[i] = Math.max(dp[i],tmp);
            }
            result = Math.max(result,dp[i]);
        }
        return result;
    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int n = scan.nextInt();
        int[] arr = new int[n];
        int[] dp = new int[n];

        for (int i = 0; i < n; i++)
            arr[i] = scan.nextInt();

        System.out.println(MaxMul(arr, n, dp));
    }
}
