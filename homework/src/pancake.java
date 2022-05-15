import java.util.*;

public class pancake {

    public static void flip(int arr[], int n, int[] reverse) {
        int max = 0;
        int tmp;
        for (int i = 1; i < n; i++) {
            if (arr[max] < arr[i])
                max = i;
        }
        if (max != 0 && max != n) {
            tmp = arr[max];
            arr[max] = arr[0];
            arr[0] = tmp;
        }
        for (int i = n - 1, j = 0; j < n; i--, j++)
            reverse[j] = arr[i];

        for (int i = 0; i < n; i++)
            System.out.print(reverse[i] + " ");
        System.out.println();

        if (n > 0)
            flip(reverse, n - 1, reverse);
    }

    public static int max(int[] arr, int from, int to) {
        if(from > to) return -1;
        int m;
        int p;
        int mid = (from + to) / 2;

        if (arr[mid] < arr[from]) {
            m = max(arr, from, mid-1);
        } else {
            m = max(arr, mid+1, to);
        }

        return (arr[mid] > m) ? arr[mid] : m;
    }

    public static int partition(int[] arr, int left, int right) {
        int lo = left;
        int hi = right;
        int pivot = arr[left];
        while(lo<hi) {
            while (arr[hi] > pivot && lo < hi)
                hi--;
            while (arr[lo] <= pivot && lo < hi) {
                lo++;
            }
            swap(arr, lo, hi);
        }
        swap(arr,left,lo);
        return lo;
    }
    public static void swap(int[] arr,int i, int j){
        int tmp = arr[i];
        arr[i]=arr[j];
        arr[j] = tmp;
    }


    public static void main(String[] args) {
//        Scanner scan = new Scanner(System.in);
//        int n = scan.nextInt();
//        int[] arr = new int[n];
//        int[] reverse = new int[n];
//        for (int i = 0; i < n; i++)
//            arr[i] = scan.nextInt();
//        flip(arr, n, reverse);
//        for (int i = 0; i < n; i++)
//            System.out.println(reverse[i]);
        int[] arr = {9, 2, 3, 13, 5, 7, 6, 10, 8, 1, 11, 12, 4};
        System.out.println(partition(arr,0,12));
        System.out.println(((201912054%10000)*3897+(201912054/100000)*(201912054/100000))%10000);
    }
}
