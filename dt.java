package JAVA;
public class dt {
    public static void main(String[] args) {
        byte b = 127;
        System.out.println("Initial value of b: " + b);
        b++;
        System.out.println("Value of b after overflow (b++): " + b);
    }
}