import java.util.*;

public class MoveZeroToEnd
{
    void pushZerosToEnd(int[] arr) {
        
        int index=0;

        for (int i=0;i< arr.length; i++ ){
            if (arr[i] !=0){
                arr[index] = arr[i];
                index++;
                
            }
        }
        while (index < arr.length){
            arr[index] = 0;
            index++;
        }
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
        MoveZeroToEnd mzte = new MoveZeroToEnd();
        mzte.pushZerosToEnd(arr);

        System.err.println("Result");
        System.out.print("[");
        for (int num : arr) {
          System.out.print(num + ",");   
        }
        System.err.println("]");

    }
}