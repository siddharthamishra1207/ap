import java.util.Scanner;

/*
  nCr = n!/r!(n-r)!
  
 */
public class binomial {
    
    public static int facto(int a){
        int fac=1;
        for(int i=1;i<=a;i++){
            fac=fac*i;
        }
        return fac;
    }


    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        int n = sc.nextInt();
        int r = sc.nextInt();
        int nCr = facto(n)/ (facto(r)*facto(n-r));
        System.out.println(nCr);
    }
}
