import java.util.Scanner;

public class dectobin {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int rem;
        int pow=0;
        int bin=0;
        while(n>0){
            rem = n%2;
            bin = (int)(bin + rem*Math.pow(10, pow));
            pow++;
            n=n/2;

        }
        System.out.println(bin);
    }
}
