import java.util.Scanner;

public class eating_cheese {
    public static int find(int n, int[][] arr){

        for(int i=1;i<n+1;i++){
            arr[i][0] += arr[i-1][0];
            arr[0][i] += arr[0][i-1];
        }

        for(int i=1;i<n+1;i++){
            for(int j =1;j<n+1;j++)
                arr[i][j] += Math.max(arr[i-1][j],arr[i][j-1]);
        }

        return arr[n][n];
    }
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int n = scan.nextInt();
        int m = scan.nextInt();
        int[][] arr = new int[n+1][n+1];

        for(int i = 1;i<m+1;i++){
            int a = scan.nextInt();
            int b = scan.nextInt();
            arr[a][b] = 1;
        }

        System.out.println(find(n,arr));
    }
}
