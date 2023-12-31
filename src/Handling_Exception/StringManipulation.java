package Handling_Exception;

import java.util.Scanner;

public class StringManipulation {
    public static String upperString(String word) throws NullPointerException {

        String oldWord = word;
        String newWord = null;
        try {
            newWord = oldWord.toUpperCase();
            System.out.println("old word: " + oldWord);
            System.out.println("new word: " + newWord);
        } catch(NullPointerException e) {
            throw new NullPointerException();
        }
        return newWord;
    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String phrase, result;
//        System.out.println("Phrase: ");
//        phrase = scan.nextLine();
        try {
            result = upperString(null);
            System.out.println(result);
        } catch(NullPointerException e) {
            e.printStackTrace();
        } finally {
            scan.close();
            System.out.println("Execução continou!");
        }

    }
}
