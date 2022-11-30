import java.util.Scanner;

public class String_PracticeQuestions {
    public static void main(String[] args){
        System.out.println("Enter the String:- ");
        Scanner sc =new Scanner(System.in);
        String strings = sc.nextLine();
        System.out.println("String in Lower Case:- "+strings.toLowerCase());      // Solution 1st Question

        System.out.println("Replace Space to Underscore:- "+strings.replace(' ', '_'));  //Solution 2nd Question

        String letter = "Dear Name, Trans a lot";
        System.out.println(letter);
        System.out.println(letter.replace("Name","Abhilasha"));

    }

}
