import java.util.Scanner;
import pemdasFiles.*;
public class PemdasDriver{
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        PostFix post = new PostFix();
        Pemdas p = new Pemdas();
        String s;
        System.out.println("Ex. ((2+1)-2/2*(3+1))^2");
        System.out.print("Enter expression: ");
        s = scan.nextLine();
        System.out.println();
        System.out.println("PostFixed: " + post.converToPostFix(s));
        int result = p.solve(s);
        System.out.println("\nresult: " + result);
    }
}