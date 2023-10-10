package File_Creator_Tests;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class FileProject {
    public static void writeInFile(String name, int age, String fileName){
        File objFile = new File(fileName);
        try {
            FileWriter writer = new FileWriter(objFile, true);
            writer.write("name: " + name + " age: " + age + "\n");
            writer.close();
            System.out.println("Gravado com Sucesso.");
        }catch(IOException e) {
            e.printStackTrace();
        }
    }

    public static void readFile(String fileName) {
        try {
            File myFile = new File(fileName);
            Scanner reader = new Scanner(myFile);
            while(reader.hasNextLine()) {
                String data = reader.nextLine();
                System.out.println(data);
            }
            reader.close();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
    }

    public static void deleteFile(String fileName) {
        File myFile = new File(fileName);
        if (myFile.delete()) {
            System.out.println("Arquivo Deletado em: " + myFile.getAbsolutePath());
        } else {
            System.out.println("Erro: Não foi possível deletar arquivo.");
        }
    }
    public static void menu() {
        System.out.println("1 - Cadastro");
        System.out.println("2 - Leitura");
        System.out.println("3 - Deletar Arquivo");
        System.out.println("4 - Sair");
        System.out.print("Opçâo: ");
    }

    public static void main(String[] args) throws IOException{
        Scanner scan = new Scanner(System.in);
        String name;
        String fileName;
        int age;
        int option;

        System.out.print("Digite o nome do arquivo: ");
        fileName = scan.next();
        fileName = fileName.concat("txt");

        File myFile = new File(fileName);
        if(myFile.createNewFile()) {
            System.out.println("Arquivo Criado!");
        }

        do {
            menu();
            option = scan.nextInt();

            switch (option){
                case 1: {
                    scan.nextLine();
                    System.out.print("Digite o nome: ");
                    name = scan.nextLine();
                    System.out.print("Digite sua idade: ");
                    age = scan.nextInt();
                    writeInFile(name, age, fileName);
                    break;
                }
                case 2: {
                    readFile(fileName);
                    break;
                }
                case 3: {
                    deleteFile(fileName);
                    break;
                }
                case 4: {
                    System.out.println("Saindo do Programa!");
                    break;
                }
                default: {
                    System.out.println("Nenhuma opção válida!");
                }
            }
        } while(option != 4);
        scan.close();
    }
}
