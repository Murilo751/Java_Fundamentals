import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class File_Creator {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        String filename;
        System.out.println("Ei cara de chibata diz o nome do arquivo ai");
        filename = scan.next();
        scan.close();
        filename = filename.concat(".txt");

        try {
            File myFileObject = new File("C:\\Users\\muril\\IdeaProjects\\Java_Fundamentals\\src\\File_Creator_Tests\\",filename);
            if(myFileObject.createNewFile()) {
                System.out.println("Arquivo Criado com Sucesso.");
            } else{
                System.out.println("Erro: Arquivo não criado.");
            }
        }catch (Exception e){
            e.printStackTrace();
        }

        try{
            FileWriter objWriter = new FileWriter(filename, true);
            objWriter.write("meu primeiro texto em arquivo 2");
            objWriter.close();
            System.out.println("conteudo salvo com sucesso 2");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
