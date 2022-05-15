import java.util.Scanner;

public class findMaxSumArr {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int n = scan.nextInt();
        int[] arr = new int[n];

        int max=0;
        int min =0;

        for(int i=0;i<n;i++)
            arr[i] = scan.nextInt();

        for(int i=0;i<n;i++){
            max=Math.max(max,0) + arr[i];
            min = Math.max(max,min);
        }
        System.out.println(min);
    }
}
