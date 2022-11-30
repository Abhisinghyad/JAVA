class Solutions {
    int Salary;
    String Name;

    public int getSalary(){
        return Salary;
    }
    public String getName(){
        return Name;
    }
    public void setName(String n){
        Name =n;
    }

}
public class Employee{
    public static void main(String[] args) {
        Solutions obj2 = new Solutions();
        obj2.setName("Abhishek Singh");
        obj2.Salary =25000;
        System.out.println("Name of Employee:- "+obj2.getName());
        System.out.println("Salary of Employee:- "+obj2.getSalary());
    }
}
