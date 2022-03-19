import java.util.Scanner;

public class findMin {
    public static int min(int arr[], int n, int min) {
        if (n==1) {
            System.out.println(min);
            return min > arr[0] ? arr[0] : min;
        }
        else if(n>1){
            System.out.println(min);
            return min > arr[n-1] ? min(arr,n-1,arr[n-1]) : min(arr,n-1,min);
        }
        else return min;
    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        int[] arr = new int[n];
        int result;
        for (int i = 0; i < n; i++)
            arr[i] = scan.nextInt();
        result = min(arr,n,arr[n-1]);
        System.out.println(result);
    }
}
