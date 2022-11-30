import java.util.Scanner;


public class Input_User {
    public static void main(String[] args){
        Scanner s= new Scanner(System.in);
        System.out.println("Enter the Num1:- ");
        //int Num1 = s.nextInt();               // Taking Input as Integer Value
        float Num1 =s.nextFloat();            //Taking input as Float Value
        System.out.println("Enter the Num2:- ");
        //int Num2 = s.nextInt();                //Taking input as Integer Value
        float Num2 = s.nextFloat();            //Taking input as Float Value
        //int Sum = Num1+Num2;
        float Sum =Num1+Num2;
        System.out.println("Sum of Two Number:- "+Sum);
        System.out.println(Sum);

    }
}
