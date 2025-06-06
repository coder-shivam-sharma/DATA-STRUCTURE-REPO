import java.text.*;
import java.util.*;

public class ConvertCurrencyProblem {
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double payment = sc.nextDouble();
        sc.close();
        
        // Currency formatters for each locale
        NumberFormat us = NumberFormat.getCurrencyInstance(Locale.US);
        NumberFormat china = NumberFormat.getCurrencyInstance(Locale.CHINA);
        NumberFormat france = NumberFormat.getCurrencyInstance(Locale.FRANCE);
        
        // For India, create a custom Locale
        Locale indiaLocale = new Locale("en", "IN");
        NumberFormat india = NumberFormat.getCurrencyInstance(indiaLocale);
        
        // Format the payment using each currency format
        String usFormatted = us.format(payment);
        String indiaFormatted = india.format(payment);
        String chinaFormatted = china.format(payment);
        String franceFormatted = france.format(payment);
        
        // Output
        System.out.println("US: " + usFormatted);
        System.out.println("India: " + indiaFormatted);
        System.out.println("China: " + chinaFormatted);
        System.out.println("France: " + franceFormatted);
    }
}
