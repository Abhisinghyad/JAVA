import java.util.Scanner;

public class IfElseCondition {
    public static void main(String[] args){
        System.out.print("Enter the Number:- ");
        Scanner sc = new Scanner(System.in);
        float Num = sc.nextFloat();
        if (Num%2==0){
            System.out.println("Number is Even:- "+Num);
        }
        else{
            System.out.println("Number is Odd:- "+Num);
        }
    }
}
