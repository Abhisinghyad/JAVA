//import jdk.dynalink.beans.StaticClass;

import java.io.FileReader;
import java.util.Scanner;

class  Details{
     int EmpID;
     String First_Name;
     String Last_Name;
     String Gender;
     String Designation;
     long AccountNum;
     String BankName;
     String AccountHolderName;
     String IFSC_code;
     String Branch;
     long aadharNo;
     String PANNO;
    public void GeneralDetails(){
        System.out.println("Details of Employee-----");
        System.out.println("Employee ID:- "+EmpID);
        System.out.println("First Name:- "+ First_Name);
        System.out.println("Last Name:- "+Last_Name);
        System.out.println("Full Name:- "+First_Name+' '+Last_Name);
        System.out.println("Gender:- "+Gender);
    }
    public void BankDetails(){
        System.out.println("Bank Details of Employee---");
        System.out.println("Account Holder Name:- "+AccountHolderName);
        System.out.println("Account Number:- "+AccountNum);
        System.out.println("IFSC Code of Bank:- "+IFSC_code);
        System.out.println("Branch of Bank:- "+Branch);
    }
    public void SecurityDetails(){
        System.out.println("Security Details of Employee---- ");
        System.out.println("Addhar Number:- "+aadharNo);
        System.out.println("PAN Card Number:- "+PANNO);
    }
}


public class CustomClass1 {

    public static void main(String[] args) {
        Details obj1 = new Details();   // Instantiating a New Details Object
        // Taking input from user for EmployeeID
        System.out.println("Enter the Employee ID:- ");
        //inserting the value in Attributes from user
        Scanner sc = new Scanner(System.in);  // Scanner function
        obj1.EmpID =sc.nextInt();

        //FirstName
        System.out.println("Enter the First Name:- ");
//        Scanner sc1= new Scanner(System.in);
        obj1.First_Name = sc.next();

        //LastName
        System.out.println("Enter Last Name:- ");
//        Scanner sc2 =new Scanner(System.in);
        obj1.Last_Name =sc.next();

        //Gender
        System.out.println("Enter Gender:- ");
//        Scanner sc= new Scanner(System.in);
        obj1.Gender = sc.next();

        //Designation
        System.out.println("Enter Designation:- ");
//        Scanner sc =new Scanner(System.in);
        obj1.Designation = sc.next();

        //Account Number
        System.out.println("Enter the Account Number:- ");
//        Scanner sc = new Scanner(System.in);
        obj1.AccountNum = sc.nextLong();

        //Account Holder Name
        System.out.println("Enter Account Holder Name:- ");
//        Scanner sc =new Scanner(System.in);
        obj1.AccountHolderName =sc.next();

        //IFSC
        System.out.println("Enter IFSC Code:- ");
//        Scanner sc = new Scanner(System.in);
        obj1.IFSC_code =sc.next();

        //Branch
        System.out.println("Enter Branch:- ");
//        Scanner sc = new Scanner(System.in);
        obj1.Branch = sc.next();

        //AadharNumber
        System.out.println("Enter the Aadhar Number:- ");
//        Scanner sc = new Scanner(System.in);
        obj1.aadharNo = sc.nextLong();

        //PanNO
        System.out.println("Enter PAN No.:- ");
//        Scanner sc = new Scanner(System.in);
        obj1.PANNO = sc.next();

        obj1.GeneralDetails();
        obj1.BankDetails();
        obj1.SecurityDetails();
        sc.close();
    }


}
