package com.JayPatel;

import java.util.Scanner;

public class Main {
    private static Scanner scanner = new Scanner(System.in);
    private static GroceryList groceryList = new GroceryList();
    public static void main(String[] args) {
	// write your code here
        boolean quit = false;
        int choice =0;

        printInstruction();

        while (!quit) {
            System.out.println("Enter your choice ");
            choice = scanner.nextInt();
            scanner.nextLine();

            switch (choice){
                case 0:
                    printInstruction();
                    break;
                case 1:
                    groceryList.printGroceryList();
                    break;
                case 2:
                    addItem();
                    break;
                case 3:
                    modifyItem();
                    break;
                case 4:
                    removeItem();
                    break;
                case 5:
                    searchForItem();
                    break;
                case 6:
                    quit=true;
                    break;
            }
        }
    }
    public static void printInstruction(){
        System.out.println(" 0 - To print choice options.");
        System.out.println(" 1 - To print the list of grocery items.");
        System.out.println(" 2 - To add an item to the list.");
        System.out.println(" 3 - To modify an item in the list.");
        System.out.println(" 4 - To remove an item from list.");
        System.out.println(" 5 - To search for an item in the list.");
        System.out.println(" 6 - To quit the application.");
    }

    public static void addItem(){
        System.out.println("Please enter the grocery item: ");
        groceryList.addGroceryItem(scanner.nextLine());
    }

    public static void modifyItem(){
        System.out.println("Enter item name to modify: ");
        String itemName = scanner.nextLine();
        System.out.print("Enter replacement item: ");
        String newItem = scanner.nextLine();
        groceryList.modifyGroceryItem(itemName,newItem);
    }
    public static void removeItem(){
        System.out.println("Enter item name: ");
        String itemName = scanner.nextLine();
        groceryList.removeGroceryItem(itemName);
    }

    public static void searchForItem(){
        System.out.print("Item to search for: ");
        String searchItem = scanner.nextLine();

        if ( groceryList.onFile(searchItem)){
            System.out.println("Found "+ searchItem+ " in our grocery list");
        }
        else {
            System.out.println(searchItem + " Is not in the list");
        }
    }

}
