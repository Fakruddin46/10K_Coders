import java.util.Scanner;

        public class Bill {
            public static void main(String[] args) {
                Scanner scanner = new Scanner(System.in);
                System.out.print("Enter the number of units consumed: ");
                int units = scanner.nextInt();
                int billAmount = 0;

                if (units <= 100) {
                    billAmount = units * 2;
                } 
                else {
                    if (units <= 200) {
                        billAmount = (100 * 2) + ((units - 100) * 3);
                    } 
                    else {
                        billAmount = (100 * 2) + (100 * 3) + ((units - 200) * 5);
                    }
                }
                System.out.println("Total Electricity Bill: ₹" + billAmount);
                scanner.close();
            }
        }