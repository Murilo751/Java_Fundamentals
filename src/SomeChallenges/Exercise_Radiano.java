package SomeChallenges;

import java.util.Scanner;
public class Exercise_Radiano {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        double g,r;

        System.out.println("Esse codigo caucula o radiano de um grau");
        System.out.println("Digite um grau:");
        g = scan.nextDouble();

        r = g * Math.PI/180;

        System.out.println("O seu radiano é "+r);

    }
}
