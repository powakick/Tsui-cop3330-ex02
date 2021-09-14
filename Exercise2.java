/*
UCF COP3330 FALL 2021 ASSIGNMENT 2 SOLUTION
COPYRIGHT 2021 Jonathan Tsui
 */
import java.util.Scanner;
public class Exercise2 {

    public static void main(String[] args) {
        String word;
        int length = 0;
        Scanner scan = new Scanner(System.in);
        System.out.println("What is the input character?");
        word = scan.nextLine();
        int nameLength = word.length();
        System.out.println(word + " has " + nameLength + " characters.");

    }
}