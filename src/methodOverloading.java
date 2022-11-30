public class methodOverloading {
    static void telljoke(){
        System.out.println("Hello Abhishek \n" +
                "Thanks");
    }
    static void telljoke(int a){        //same name of method overloading method
        System.out.println("Amount will be " +a);
    }
    public static void main(String[] args){
        telljoke();
        telljoke(120);
    }
}
