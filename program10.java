import java.util.Scanner;

public class program10 {
    public static void main(String[] args) {
        // print ASCII VALUE
        System.out.print("enter chracter");
        Scanner sc = new Scanner (System.in);
        char a = sc.next().charAt(0);
        int covert= a;
        System.out.print("ASCII VALUE OF " + a + "  " +"is" +  "  "+ covert );
    }
}
