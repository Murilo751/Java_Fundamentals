import java.util.Scanner;

public class Matrix_Diagonal_Sum {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int matrix[][] = new int[3][3];
        int DiagonalSum = 0;

        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                System.out.printf("Digite a posicao [%d][%d] da matriz: ", i+1, j+1 );
                matrix[i][j] = scan.nextInt();
                if (i == j){
                    DiagonalSum = DiagonalSum + matrix[i][j];
                }
            }
        }
        System.out.println("A soma da diagonal principal da matriz é " + DiagonalSum);
        scan.close();
    }
}
