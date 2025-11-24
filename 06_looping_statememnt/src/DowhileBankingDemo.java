import java.util.Scanner;

public class DowhileBankingDemo {

    public static void main(String[] args) {
        

        int i=1;
        int balance=0;
        String wantsContinue="y";
        do{  //if we dontknow number of iteration and you want to execute do block once then go with do while block.

            System.out.println("welcome in SBI");
            System.out.println("press 1 : check balance");
            System.out.println("press 2: withdraw amount");
            System.out.println("press 3: deposite money");
            System.out.println("press 4: for EXIT");
            System.out.println("Enter your choice from above");
            Scanner sc =new Scanner(System.in);
            int choice=sc.nextInt();
                if(choice==1){
                    System.out.println("your account balance is :"+balance);

                }

                else if (choice==2){
                     if(balance==0){
                        System.out.println("no money in your account please deposite money first");
                        continue;
                     }
                    System.out.println("enter your withraw amount");
                    int withdrawAmt=sc.nextInt();
                     if(withdrawAmt<=balance){

                        System.out.println("you withdrawn amount :"+withdrawAmt );
                        balance-=withdrawAmt;
                        System.out.println("remaining balance :"+balance);

                     }
                     else 
                     {
                        System.out.println("insufficient balance");
                     }

                }
                else if(choice==3){
                    System.out.println("enter money do you want to deposite");
                    int depositeAmt=sc.nextInt();
                    if(depositeAmt>0){
                        balance+=depositeAmt;
                    }else
                    {
                      System.out.println("please enter valid amount");
                    }
                }
               else if(choice==4){
                System.out.println("thanks for baqnking with us......");
                break;
               }
               else{
                System.out.println("invalid input");
                
               }

               System.out.println("Do you want to continue: y/n");
                wantsContinue=sc.next();
               if (wantsContinue.equalsIgnoreCase("n")){
                System.out.println("thank you.....visit again");
                break;   // will stop execution of main reurnt towards main
               }

                


        }while(wantsContinue.equalsIgnoreCase("y"));
    }

}
