import java.util.Scanner;

public class Harmonic_Num {
    public static void main(String[] args) {
        System.out.println("");
        Scanner scan = new Scanner(System.in);
        int termos;
        double serieHarmonica = 0;
        System.out.printf("Digite a quantidade de termos da H(n): ");
        termos = scan.nextInt();

        for (int i = 1; i <= termos; i++ ){
                serieHarmonica = serieHarmonica + (double) 1/i;
        }

        System.out.println("Harmonica = " + serieHarmonica);
    }
}
