import java.util.Scanner;
class payable {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the amount to be paid:");
        int amount = sc.nextInt();
        if (amount < 500) {
            System.out.println("No discount applicable.");
        } else if (amount >= 500 && amount < 1000) {
            double discount = amount * 0.05;
            double payableAmount = amount - discount;
            System.out.println("Discount: " + discount);
            System.out.println("Total amount to be paid: " + payableAmount);
        } else if (amount >= 1000 && amount < 5000) {
            double discount = amount * 0.10;
            double payableAmount = amount - discount;
            System.out.println("Discount: " + discount);
            System.out.println("Total amount to be paid: " + payableAmount);
        } else {
            double discount = amount * 0.15;
            double payableAmount = amount - discount;
            System.out.println("Discount: " + discount);
            System.out.println("Total amount to be paid: " + payableAmount);
        }
    }
}