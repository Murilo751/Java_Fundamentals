import java.util.Scanner;

public class Array_Exercise {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int[] array = new int[10];
        int contPar = 0;

        for (int i = 0; i < array.length; i++) {
            System.out.printf("Digite o [%d]", i+1);

            array[i] = scan.nextInt();
            if (array[i] % 2 == 0){
                contPar++;
            }

        }
        System.out.println("a quantidade de pares são " + contPar);
        scan.close();
    }
}
