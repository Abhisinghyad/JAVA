import java.util.Scanner;
public class IfElseSwitch {
    public static void main(String[] args){
        System.out.println("Enter the AGE:- ");
        Scanner sc = new Scanner(System.in);
        int Age = sc.nextInt();
//        if(Age<18){
//            System.out.println("You are a child your age is :- "+Age);
//        }
//        else if(Age>18){
//            System.out.println("You are a Adult your age is  :-"+Age);
//        }
//        else if(Age>30 || Age<50){
//            System.out.println("You are more than Adult or man condition your age is  :_"+Age);
//        }
        switch (Age){
            case 18:
                System.out.println("Your are a child");
                break;
            case 25:
                System.out.println("Your are a Adult man or Women");
                break;
            case 40:
                System.out.println("Your are older Aged man or women");
                break;
            default:
                System.out.println("Your life is your choice Not Others!!!!!");

        }
        System.out.println("!!!!!!---Thanks for using this Age tools !!!!!!!! ");
    }
}
