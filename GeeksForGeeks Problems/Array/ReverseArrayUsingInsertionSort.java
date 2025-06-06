
import java.util.*;

public class ReverseArrayUsingInsertionSort
{
    public static void ReverseArray(int arr[]) {
        int n = arr.length;
        for ( int i=0; i < n/2;i++){
            int temp = arr[i];
            arr[i] = arr[n-1-i];
            arr[n-1-i] = temp;
        }

        System.out.print("[");
        for (int j=0;j<n;j++) {
            System.out.println(arr[j]);
            if (j<n-1){
                System.out.println(",");
            }  
        }
        System.out.println("]");
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the size of an array :");
        int size = sc.nextInt();

        int[] arr = new int[size];

        for ( int i=0; i<size ;i++){
            arr[i] = sc.nextInt();

        }

        ReverseArrayUsingInsertionSort rv = new ReverseArrayUsingInsertionSort();
        rv.ReverseArray(arr);
        
        
    }

}