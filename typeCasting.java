package JAVA;

public class typeCasting {
    public static void main(String[] args) {
        // Implicit casting (widening)
        int i = 100;
        double d = i; // int to double
        System.out.println("Implicit casting (int to double): " + d);

        // Explicit casting (narrowing)
        double x = 99.99;
        int y = (int) x; // double to int
        System.out.println("Explicit casting (double to int): " + y);

        // Casting int to byte (possible data loss)
        int large = 130;
        byte small = (byte) large;
        System.out.println("Casting int 130 to byte: " + small);
    }
}
