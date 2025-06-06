import java.util.*;

public class ReverseArrayUsingHeapSort
{
    public void heapify(int[] arr,int n, int i){
        int largest = i;
        int left = 2*i + 1;
        int right = 2*i+2;

        //if left is greater than root than push it right 
        if (left < n && arr[left] >arr[largest]){
            largest = left;
        }
        //right child greater than root 
        if (right <n && arr[right] > arr[largest]){
            largest = right;
        }

        if (largest != i){
            //swap 
            int temp =arr[i];
            arr[i]  = arr[largest];
            arr[largest] = temp;

            heapify(arr,n,largest);
        }
    }
    public static void main(String [] args ){
        Scanner sc = new Scanner(System.in);
       System.out.println("enter the size of an array:");
       int size = sc.nextInt();

       int[] arr = new int[size];
        //for input
       for (int i = 0; i < arr.length; i++){
        arr[i] = sc.nextInt();
       }

       //for output 
        System.out.print("[");
       for (int num : arr) {
        System.out.print(num + ",");   
       }
       System.err.println("]");

       // solution 
       ReverseArrayUsingHeapSort newarr = new ReverseArrayUsingHeapSort(); 

       System.err.println("Second Largest Number");
    }
}