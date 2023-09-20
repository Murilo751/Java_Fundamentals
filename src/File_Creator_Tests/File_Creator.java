package File_Creator_Tests;

import java.io.File;
import java.io.FileNotFoundException;
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
            File myFileObject = new File(filename);
            if(myFileObject.createNewFile()) {
                System.out.println("Arquivo Criado com Sucesso.");
            }
            else if (myFileObject.exists()) {
                System.out.println("Filename: " + myFileObject.getName());
                System.out.println("Path of file: " + myFileObject.getAbsolutePath());
                System.out.println("Write Permission: " + myFileObject.canWrite());
                System.out.println("Read Permission: " + myFileObject.canRead());
                System.out.println("File Lenght: " + myFileObject.length());
            }
            else{
                System.out.println("Erro: Arquivo não criado.");
            }

        } catch (Exception e){
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

        try {
            File fileObj = new File(filename);
            Scanner reader = new Scanner(fileObj);
            while (reader.hasNextLine()){
                String dt = reader.nextLine();
                System.out.println(dt);
            }

        }catch (FileNotFoundException e){
            e.printStackTrace();
        }
        catch (IOException e){
            e.printStackTrace();
        }
    }
}
