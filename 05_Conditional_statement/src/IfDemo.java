import java.util.Scanner;

public class IfDemo {
    public static void main(String[] args) throws Exception {
        Scanner sc =new Scanner(System.in);

        String name=sc.next();

        if(name.length()<3 || name.length()>15){
            System.out.println("please enter valid name");
            return;//this will exection of maiun method. line below this stATMENT WIULL NOT BE EXECUTED

        }
         
        System.out.println("Enter your password");
        String password=sc.next();

        if(password.length()>15){
            System.out.println("password must be at least 8 characters long");
            return;
            
        }

        if(name.equals("mangu")&& password.equals("mangu@1432")){
            System.out.println("login successful");
            return;
        }
    
           System.out.println("invalid credentials");
        }





        
    }

