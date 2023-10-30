package SomeChallenges;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String name;
        System.out.printf("digite seu nome: ");
        name = scan.nextLine();
        System.out.println("Bem vindo! Sr(a) " + name);
    }
}