public class VariableArgument {
//    static int sum(int a, int b){
//        return a+b;
//    }
//    static int sum(int a, int b, int c){          //Overloading method
//        return a+b+c;
//    }
//    static int sum(int a, int b, int c, int d){     // overloading method sum
//        return a+b+c+d;
//    }
    static int sum(int x,int ...arr){                        //... triple dots are represent the array is knows vararr
//        int [] arr
        int result = x;
          for (int a: arr){
              result +=a;
          }return result;
    }

    public static void main(String[] args) {
        System.out.println("Sum of nothing: "+sum(1));
        System.out.println("Sum of 2 number: "+sum(2,3));
        System.out.println("Sum of 3 number: "+sum(4, 5,8));
        System.out.println("Sum of 4 number: "+sum(5,6,78,4));
    }
}
