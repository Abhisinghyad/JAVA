

public class Solution {
    float sum(float x, float y){
        return x+y;
    }
    float sub(float x, float y ){
        if (x>y){
            return x-y;
        }
        else{
            return y-x;
        }
    }
    float multiplication(float x, float y){
        return x*y;
    }
    float division(float x, float y){
        return x/y;
    }

    public static void main(String[] args) {
        float a = 5;
        float b = 45;
        float c;
        Solution obj =new Solution();
        c=obj.sum(a,b);
        System.out.println("Sum of 2 number: "+c);
        Solution obj1 =  new Solution();
        c=obj1.sub(a,b);
        System.out.println("Subtraction of two number:- "+c);
        Solution obj2 = new Solution();
        c = obj2.multiplication(a, b);
        System.out.println("Multiplication of two number:- "+c);
        Solution obj3 = new Solution();
        c = obj3.division(a, b);
        System.out.println("Division of two number:- "+c);
    }

}
