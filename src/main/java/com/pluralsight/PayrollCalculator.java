package com.pluralsight;

import java.util.Scanner;

public class PayrollCalculator {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Prompt the user to enter their name, hours worked, and pay rate
        System.out.print("Enter your name: ");
        String name = input.nextLine();
        System.out.print("Enter hours worked: ");
        double hours = input.nextDouble();
        System.out.print("Enter pay rate: ");
        double rate = input.nextDouble();

        // Calculate gross pay: hours times the hourly rate
        double grossPay = hours * rate;

        // Display the employees name and gross pay
        System.out.println("Name: " + name);
        System.out.println("Gross Pay: $" + String.format("%.2f", grossPay));

        // Close the scanner
        input.close();
    }
}
