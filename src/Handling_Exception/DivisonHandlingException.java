package Handling_Exception;

import java.util.Scanner;

public class DivisonHandlingException {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int v1, v2 ;
        double result = 0;
        System.out.print("Value 1: ");
        v1 = scan.nextInt();
        System.out.print("Value 2: ");
        v2 = scan.nextInt();
        try {
            result = v1/v2;
            System.out.println("Result: " + result);
        } catch(ArithmeticException e) {
//            System.out.println(e.getCause());
            e.printStackTrace();
        } finally {
            scan.close();
            System.out.println("Still running at all!");
        }
        System.out.println("Hellooo!");
    }
}
