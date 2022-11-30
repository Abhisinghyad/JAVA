public class Methods_java {
     int logic(int x, int y){       // method
        int z;
        if(x<y){
            z = x*y;
        }
        else{
            z=x+y;
        }
        return z;

    }
    public static void main(String[] args){
        int a=5;
        int b=12;
        int c;
        int a1=12;
        int b1=13;
        int c1;
        //Method invocation using object creation
        Methods_java obj = new Methods_java();
        c = obj.logic(a,b);
//        c=logic(a,b);
//        c1=logic(a1,b1);
        System.out.println(c);
//        System.out.println(c1);
    }
}