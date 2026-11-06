import java.util.Scanner;

public class program4 {
// sum of first n natural number
    public static void main(String[] args) {
        System.out.print("enter your no of terns..");
        int sum = 0;
        Scanner sc = new Scanner (System.in);
        int n = sc.nextInt();
        for(int i=1;i<=n;i++){
            sum = sum+i;
        }
        System.out.print("addition =" + sum);
    }
}
