
// making a Custom Class
class Employe{
    int id;
    String Name;
    float Salary;
    String Profile;
    public void PrintDetails(){
        System.out.println("Employee Details:- ");
        System.out.println("ID:- "+id);
        System.out.println("Name of Employee:- "+Name);
        System.out.println("Profile:- "+Profile);
    }
    public void Salary(){
        System.out.println("Salary:- "+Salary);
    }
}


public class customClass {
    public static void main(String[] args){

        Employe Abhishek = new Employe();  //Instantiating a New Employee Object
        //Setting Attributes
        Abhishek.id = 2128;
        Abhishek.Name = "Abhishek Singh";
        Abhishek.Salary = 25000;
        Abhishek.Profile = "Quality Analyst";
        //Printing the Attributes
        //System.out.println(Abhishek.id);
        Abhishek.PrintDetails();
        Abhishek.Salary();
    }
}

