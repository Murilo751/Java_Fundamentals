import java.util.Scanner;

public class Peso_Exercise {
    public static void main(String[] args) {
        Scanner scan  = new Scanner(System.in);

        double altura;
        double pesoIdeal = -1;
        String genero;

        altura = scan.nextFloat();
        genero = scan.next();

        switch (genero.toUpperCase()){
            case "HOMEM":
            case "H": {
                pesoIdeal = 72.7 * altura - 58;
                break;
            }

            case "MULHER":
            case "M": {
                pesoIdeal = 62.1 * altura - 44.7;
                break;
            }

            case "FLAMENGO" : {
                System.out.println("Esse time é seleção");
                break;
            }

            default:
                System.out.println("Genero não valido.");
        }


    }
}
