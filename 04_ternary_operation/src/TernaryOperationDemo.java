import java.util.Scanner;

public class TernaryOperationDemo {
    public static void main(String[] args) throws Exception {

        //(condition) ? value_if_true : value_if_false; //data type of value_if_true and value_if_false must be same
        //  String result =(a>b) ? "a is less than b" :10; //error  --> incompatible types: String and int

        // int a=10;
        // int b=20;
        // String result =(a>b) ? "a is less than b" :"b is greater than a";
        // System.out.println(result);
        // System.out.println("********Voting Eligibility********");
        // Scanner sc =new Scanner(System.in);
        // int age=sc.nextInt();
        // int result=(age>=18) ? 1 :0;  //data type of value_if_true and value_if_false must be same and same datatype of assigned variable
        // System.out.println("Voting Eligibility: "+result);


       // String result=(age>=18) ?"youa are eligible for vote": "you are not eligible for vote";
       // System.out.println(result);


       System.err.println("********HR salary increament********");
       Scanner sc =new Scanner(System.in);
       double currentSalary=sc.nextDouble();

       System.out.println("Current Salary: "+currentSalary);

      double newSalary= (currentSalary<=50000) ? currentSalary*2.0 : currentSalary*1.5 ;
        System.out.println("New Salary: "+newSalary);




    }
}
