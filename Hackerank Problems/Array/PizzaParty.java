import java.util.Scanner;

public class PizzaParty {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int A = sc.nextInt(); // number of boys (excluding Chef)
        int B = sc.nextInt(); // number of girls

        int totalSlices = 4 * (A + 1) + 3 * B;
        int pizzas = (totalSlices + 7) / 8; // same as ceiling of totalSlices / 8

        System.out.println(pizzas);
        sc.close();
    }
}
