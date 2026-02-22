package com.omkar_general_store;

import java.util.Scanner;

public class App {
    public static double calculateTotal(int choice, int quantity) {

    double price = 0;

    switch (choice) {
        case 1: price = 6; break;
        case 2: price = 10; break;
        case 3: price = 120; break;
        case 4: price = 140; break;
        case 5: price = 20; break;
        default: return -1;
    }

    return price * quantity;
}
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("=================================");
        System.out.println("     OMKAR GENERAL STORE");
        System.out.println("=================================");

        System.out.println("Available Items:");
        System.out.println("1. Eggs (6 rupees each)");
        System.out.println("2. Biscuit (10 rupees each)");
        System.out.println("3. Moong Dal (120 rupees per kg)");
        System.out.println("4. Udad Dal (140 rupees per kg)");
        System.out.println("5. Chips (20 rupees per packet)");

        System.out.print("\nEnter item number: ");
        int choice = sc.nextInt();

        System.out.print("Enter quantity: ");
        int quantity = sc.nextInt();

        double price = 0;
        String itemName = "";

        switch (choice) {
            case 1:
                itemName = "Eggs";
                price = 6;
                break;
            case 2:
                itemName = "Biscuit";
                price = 10;
                break;
            case 3:
                itemName = "Moong Dal";
                price = 120;
                break;
            case 4:
                itemName = "Udad Dal";
                price = 140;
                break;
            case 5:
                itemName = "Chips";
                price = 20;
                break;
            default:
                System.out.println("Invalid choice!");
                return;
        }

        double total = price * quantity;

        System.out.println("\n========== BILL ==========");
        System.out.println("Shop Name : Omkar General Store");
        System.out.println("Item      : " + itemName);
        System.out.println("Quantity  : " + quantity);
        System.out.println("Total rupees   : " + total);
        System.out.println("==========================");

        sc.close();
    }
}