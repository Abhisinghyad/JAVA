public class String_method {
    public static void main(String[] args){
        String Name1 = new String("JavaIsObjectOrientedLanguage");
        System.out.println(Name1);
        System.out.println("Length of String:- "+Name1.length());  //Length of the String =variable.length
        System.out.println(Name1.toLowerCase());                   //String convert to LowerCase= Variable.toLowerCase()
        System.out.println(Name1.toUpperCase());                   //String convert to UpperCase= variable.toUpperCase()
        String Name2 = new String( "    Java Language     "  );
        System.out.println("WithoutTrim:- "+Name2);
        System.out.println("Trim ofString:-"+Name2.trim());         // trim is using for removing space from starting and ending of the string Variable.trim()
        System.out.println(Name1.substring(2));           //indexing using
        System.out.println(Name1.replace('O','W'));  // replace characters

    }
}
