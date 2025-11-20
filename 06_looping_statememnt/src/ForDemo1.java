public class ForDemo1 {
    public static void main(String[] args) throws Exception {

        // System.out.println("Hello, World!");
        // for(int i=1,j='a';i<=10;i++,j++){
        //     System.out.println(i + " " + (char)j);  //this will print character by casting. pring char for that asci value
        //     //System.out.println(i + " " + j);//this j will print ASCII value by adding plus one in 65
        // }

        // for(int i=0,j=1;i<=10;){/////increment part not given so loop will continue in infinity until we give break condition
        //     System.out.println(i + " " + j);
            
            
        // }

        for(int i=1,j=1;j<=10;i++){ // here increment part is for i only so j will remain same and loop will continue in infinity until we give break condition
            System.out.println(i);

        }
    }
}
