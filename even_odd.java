package JAVA;
import java.util.Scanner;
public class even_odd {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int num = sc.nextInt();
        if ((num & 1) == 0) {
            System.out.println("true");
        } else {
            System.out.println("false");
        }
        sc.close();
    }
}
