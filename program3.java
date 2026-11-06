import java.util.Scanner;
public class program3 {
// print n natural number
    public static void main(String[] args) {
        System.out.println("no.of terms..");
        Scanner sc = new Scanner (System.in);
        int n = sc.nextInt();
        for(int i=1;i<=n;i++){

            System.out.print(i +"   ");
        }
    }
}
