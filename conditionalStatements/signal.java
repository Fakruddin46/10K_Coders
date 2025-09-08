public class signal {
    public static void main(String[] args) {
        int choice = 1; // Change this value to test different inputs
        String result = switch (choice) {
            case 1 -> "start";
            case 2 -> "Settings";
            case 3 -> "exit";
            default -> "Invalid choice";
        };
        System.out.println(result); 
    }
}
