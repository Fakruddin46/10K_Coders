import java.util.Scanner;
class Calculator{

    public static void add(int a, int b) {
        System.out.println("Sum: " + (a + b));
    }

    public static void sub(int a, int b) {
        System.out.println("Difference: " + (a - b));
    }

    public static void mul(int a, int b) {
        System.out.println("Product: " + (a * b));
    }

    public static void div(int a, int b) {
        System.out.println("Quotient: " + (a / b));
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter 1 for addition, 2 for subtraction, 3 for multiplication, 4 for division");
        int opt = sc.nextInt();
        System.out.println("Enter first number");
        int num1 = sc.nextInt();
        System.out.println("Enter second number");
        int num2 = sc.nextInt();

        switch (opt) {
            case 1:
                add(num1, num2);
                break;
            case 2:
                sub(num1, num2);
                break;
            case 3:
                mul(num1, num2);
                break;
            case 4:
                if (num2 != 0) {
                    div(num1, num2);
                } else {
                    System.out.println("Error: Division by zero is not allowed.");
                }
                break;
            default:
                System.out.println("Invalid option");
        }
    }
}