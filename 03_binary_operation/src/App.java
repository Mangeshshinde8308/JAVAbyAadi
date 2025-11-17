public class App {
    public static void main(String[] args){
        System.out.println("Hello, World!");
        int a = 10;
        int b = 20;
        System.out.println(a++);//post assignement --first only assign thern second statment is print f then 1 will add in a
        System.out.println(a);//11
        System.out.println(b++);//
        a+=30;  // a=a+30
        System.out.println(a);//41


        a=100;
        b=200;
        int result=++a + ++b; // Pre-increment
        System.out.println("value of a after pre-increment: " + a );//means first increased then assigned and then print
        System.out.println("Result of ++a + ++b: " + result); //first increment then addition


        // int result = a++ + b++; // Post-increment
        // System.out.println("Result of a++ + b++: " + result);  //first only addition then increment
        // System.err.println("Value of a after post-increment: " + a);
        // System.out.println("Value of b after post-increment: " + b);
       


    }
}
