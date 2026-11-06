import java.util.*;
public class program1 {
    public static void main(String[] args) {
        // check odd and even
        System.out.println("enter your number");
Scanner sc  = new Scanner (System.in);
int n= sc.nextInt();
if (n%2==0){
    System.out.print(n +"=" +"even");
}
else{
        System.out.print(n +"="  +"odd");

}
    }
}
