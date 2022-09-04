import java.util.Scanner;

class fun{
    
    // function which don not take input nor return anything 
    public static void printhello(){
        System.out.println("hello world");
    }
    
    public static void sum(){
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int  sum = a+b;
        System.out.println("the sum is:" + sum);
    }

    public static int sumpar(int a, int b){
        
        int  sum = a+b;
        return sum;
        //System.out.println("the sum is:" + sum);
    }


    public static int sumreturn(){
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int  sum = a+b;
        return sum;
       // System.out.println("the sum is:" + sum);
    }



    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        System.out.println(sumpar(a, b));  
        


        //  sum();// calling 
         //System.out.println(sumreturn());  
      
        printhello(); // calling function    
    }
}