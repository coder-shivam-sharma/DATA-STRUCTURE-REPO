
import java.util.*;


class Second_Largest_Number
{
     public int getSecondLargest(int[] arr) {
    
        if (arr.length < 2){
            return -1;
        }
        int FirstLargest = Integer.MIN_VALUE;
        int SecondLargest = Integer.MIN_VALUE;
        
        for (int i : arr){
             if (i > FirstLargest){
                 SecondLargest = FirstLargest;
                 FirstLargest = i;
             }else if (i> SecondLargest && i != FirstLargest){
                 SecondLargest = i;
             }
        }
        return  (SecondLargest == Integer.MIN_VALUE) ? -1:SecondLargest;
    }
    public static void main(String[] args) {
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
       Second_Largest_Number sln = new Second_Largest_Number();
       int result = sln.getSecondLargest(arr);

       System.err.println("Second Largest Number"+result);

    }
}