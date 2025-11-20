import java.util.Scanner;

public class WhileDemo1 {
    
    public static void main(String[] args) {

        //initiallization
        //while(condition)
        {
            //updataion
        }
        Scanner sc=new Scanner(System.in);
        int num=-1;
        while(num<0){
            System.out.println("enter ypur number");
            num=sc.nextInt();

            if(num>0){
                System.out.println("you entered positive number");
            }
            else{
                System.out.println("enter psitive number again");
            }
        }//if number negartive means loop run again and again ance it will get positive number num will assign positive number and it will not enter into loop
    }
}
