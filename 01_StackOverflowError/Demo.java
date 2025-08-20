public class Demo {
    public static void main(String[] args) {
        System.out.println("running main string args");  // this methid will execute first. jVM wull look for this method first
        main(100);
    }

    public static void main(int x){
        String []str={"mangu","ramu","sita"};
        System.out.println("running int args main metthos");
        
        //main(str); due to thhis stack overflow error will occure
        
    }
    
}
