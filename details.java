package JAVA;

import java.util.Scanner;

class details {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter your name:");
        String name = sc.nextLine();
        System.out.print("Enter your age:");
        int age = sc.nextInt();
        sc.nextLine(); // Consume the newline character1
        System.out.print("Enter your collage name:");
        String collage = sc.nextLine();
        System.out.print("Enter your place:");
        String place = sc.nextLine();
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
        System.out.println("Collage: " + collage);
        System.out.println("Place: " + place);
        sc.close();
    }
}