import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class List_Exemple {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int quantParticip;
        List<String> names = new ArrayList<>();
        System.out.print("Digite a quantidade de participantes: ");
        quantParticip = scan.nextInt();

        for (int i = 0; i < quantParticip; i++) {
            System.out.print("Digite um nome: ");
            names.add(scan.next());
        }

        for (String n: names) {
            System.out.println(n);
        }
    }
}
