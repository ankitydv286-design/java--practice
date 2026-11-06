import java.util.Scanner;
public class program7 {
    // sum of odd and even number
    public static void main(String[] args) {
        System.out.print("enter your range");
        Scanner sc =new Scanner (System.in);
        int n = sc.nextInt();
        int sum = 0;
        if (n%2==0){
            for (int i=0;i<=n;i+=2){
                sum = sum+i;
            }
                            System.out.print(sum);

        }
        else{
            for (int i=1;i<=n;i+=2){
                sum= sum+i;
            }
            System.out.print(sum);
        }
    }
}
