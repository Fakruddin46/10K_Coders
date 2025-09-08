public class cal {
    public static void main(String[] args) {
        int a = 10;
        int b = 5;
        char operator = '+'; // Change this to '-', '*', '/' to test other operations

        switch (operator) {
            case '+':
                System.out.println("Addition: " + (a + b));
                break;
            case '-':
                System.out.println("Subtraction: " + (a - b));
                break;
            case '*':
                System.out.println("Multiplication: " + (a * b));
                break;
            case '/':
                System.out.println("Division: " + (a / b));
                break;
            default:
                System.out.println("Invalid operator");
        }   
    }
}
