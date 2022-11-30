import java.util.Scanner;

public class WhileLoop {
    public static void main(String[] args){
      System.out.println("Enter the Number:- ");
      Scanner sc = new Scanner(System.in);
      int nu = sc.nextInt();
        int num=1;
      while(num<=nu){
          System.out.println(num);
          num++;
      }
        System.out.println("Thanks for using ");
    }
}
