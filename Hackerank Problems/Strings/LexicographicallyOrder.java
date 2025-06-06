import java.util.*;
public class LexicographicallyOrder{
    public static void main(String[] args) {
       Scanner sc = new Scanner(System.in);
       String A = sc.next();
       String B = sc.next();

       A = A.toLowerCase();
       B = B.toLowerCase();

       if (A.compareTo(B)>0){
        System.out.println("yes");
       }else

    }
}