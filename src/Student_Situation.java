import java.util.Scanner;
public class Student_Situation {
    public static void main(String[] args) {
        float grade1, grade2, media, finalGrade;

        Scanner scan = new Scanner(System.in);
        System.out.println("Digita sua primeira nota");
        grade1 = scan.nextFloat();
        System.out.println("Digite sua segunda nota");
        grade2 = scan.nextFloat();

        media = (grade1 + grade2) / 2;

        if (media < 4 ){
            System.out.println("Você foi reprovado e sua media foi "+ media);
        } else if ( media >= 7 ) {
            System.out.println("Você foi aprovado e sua media foi "+ media);
        }
        else {
            System.out.println("diga a sua nota final");
            finalGrade = scan.nextFloat();
            if (finalGrade >= 5){
                System.out.println("Aprovado");
            } else {
                System.out.println("Reprovado");
            }

        }

    }
}
