
import java.util.Scanner;

public class PercentageCalculator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the First Subject Marks:- ");
        float firstNum1 = sc.nextFloat();
        System.out.println("Enter the 2nd Subject marks:- ");
        float secNum2 = sc.nextFloat();
        System.out.println("Enter the 3rd subject marks:- ");
        float thrNum3 = sc.nextFloat();
        System.out.println("Enter the fourth Subject Marks:- ");
        float fourthNum4 = sc.nextFloat();
        System.out.println("Enter the fifth Subject Marks:- ");
        float fifthNum5 = sc.nextFloat();

        System.out.println("Total Number:- ");
        float total = sc.nextFloat();


        float sum = firstNum1+secNum2+thrNum3+fourthNum4+fifthNum5;
        float percent = (sum/total)*100;

        System.out.println("Percentage of 5 Subject:- "+percent+"%");





    }
}
