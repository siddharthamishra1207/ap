import java.util.Scanner;

public class binarytodec {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int ld;
        int pow = 0;
        int dec=0;
        while(n>0){
            ld=n%10;
            dec= (int) (dec+ Math.pow(2, pow));
            pow++;
            n=n/10;

        }
        System.out.println(dec);
    }
}
