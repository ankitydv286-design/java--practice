import java.util.Scanner;
public class program9 {
    public static void main(String[] args) {
        // to check vowel or constant
        System.out.print("enter your char.. ");
        Scanner sc = new Scanner (System.in);
        char n = sc.next().charAt(0);
        if(n=='a'|| n=='e'||n=='i'||n=='o' ||n=='u'){
            System.out.print("vowel");
        }
        else{
                        System.out.print("constant");

        }
    }
}
