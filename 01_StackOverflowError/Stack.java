public class Stack {
    public static void fun(int n){
        if(n==1000){
            System.out.println("Reached base case with n = " + n);
            return;
        }
        System.out.println("fun(" + n + ")");
        fun(n+1);
        //we called function inside function that is recursion.
        //one by one stack will create in memory whenver fun will call. if as we not provide limit (base case) then function call will go on and on
        //and stack overflow error can raise
        

    }

    public static void main(String[] args) {
        
         fun(1); 

        }  
    }


