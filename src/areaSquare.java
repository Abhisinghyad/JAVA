import java.util.Scanner;

class Square{
    int Side;
    public int Area(){
        return Side*Side;
    }
    public int Perimeter(){
        return 4*Side;
    }

}
public class areaSquare {
    public void main(String[] args){
        Square sq = new Square();
        System.out.println("Enter the Number to find Area or Perimeter:- ");
//        Scanner s = new Scanner(System.in);
//        sq.Side = s.nextInt();
//        System.out.println("Area of Square is:- "+sq.Area());
//        System.out.println("Perimeter of Square is :- "+sq.Perimeter());
    }
}
