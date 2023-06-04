package com.example.demo.util;

import java.util.HashMap;
import java.util.Scanner;

public class VendingMachine {
    private HashMap<String, Product> productMap;
    private double balance;

    public VendingMachine() {
        productMap = new HashMap<>();
        balance = 0.0;
    }

    public void addProduct(Product product) {
        productMap.put(product.getName(), product);
    }

    public void displayProducts() {
        System.out.println("Available products:");
        for (Product product : productMap.values()) {
            System.out.println(product.getName() + " - " + product.getPrice());
        }
    }

    public void purchaseProduct(String productName) {
        Product product = productMap.get(productName);
        if (product == null) {
            System.out.println("Product not found");
        } else if (product.getQuantity() == 0) {
            System.out.println("Product out of stock");
        } else if (balance < product.getPrice()) {
            System.out.println("Insufficient balance");
        } else {
            product.setQuantity(product.getQuantity() - 1);
            balance -= product.getPrice();
            System.out.println("Thank you for your purchase");
        }
    }

    public void displayBalance() {
        System.out.println("Current balance: " + balance);
    }

    public void insertMoney(double amount) {
        balance += amount;
        System.out.println("Current balance: " + balance);
    }

    public static void main(String[] args) {
        VendingMachine vendingMachine = new VendingMachine();

        // Add products to the vending machine
        vendingMachine.addProduct(new Product("Coke", 1.50, 10, "Cold drink"));
        vendingMachine.addProduct(new Product("Pepsi", 1.50, 8, "Cold drink"));
        vendingMachine.addProduct(new Product("Chips", 1.00, 20, "Snack"));

        Scanner scanner = new Scanner(System.in);
        boolean isRunning = true;

        while (isRunning) {
            System.out.println("Welcome to the vending machine");
            System.out.println("1. Display products");
            System.out.println("2. Purchase a product");
            System.out.println("3. Insert money");
            System.out.println("4. Check balance");
            System.out.println("5. Exit");

            int choice = scanner.nextInt();
            scanner.nextLine();

            switch (choice) {
                case 1:
                    vendingMachine.displayProducts();
                    break;
                case 2:
                    System.out.println("Enter product name:");
                    String productName = scanner.nextLine();
                    vendingMachine.purchaseProduct(productName);
                    break;
                case 3:
                    System.out.println("Enter amount:");
                    double amount = scanner.nextDouble();
                    vendingMachine.insertMoney(amount);
                    break;
                case 4:
                    vendingMachine.displayBalance();
                    break;
                case 5:
                    isRunning = false;
                    break;
                default:
                    System.out.println("Invalid choice");
            }
        }
    }
}