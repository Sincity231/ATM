package com.company;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        ATM a = new ATM();
        System.out.print("Enter activity #1-6: ");
        int choice = in.nextInt();
        while (choice != 6) {
            if (choice == 1) {
                System.out.println(a.setDeposit());
                System.out.print("Enter activity #1-6: ");
                choice = in.nextInt();
            }
            if (choice == 2) {
                System.out.println(a.setWithdraw());
                System.out.print("Enter activity #1-6: ");
                choice = in.nextInt();
            }
            if (choice == 3) {
                System.out.println(a.setPayment());
                System.out.print("Enter activity #1-6: ");
                choice = in.nextInt();
            }
            if (choice == 4) {
                System.out.println(a.setTransfer());
                System.out.print("Enter activity #1-6: ");
                choice = in.nextInt();
            }
            if (choice == 5) {
                System.out.println(a.getReceipt());
                System.out.print("Enter activity #1-6: ");
                choice = in.nextInt();
            }
        }
        System.out.println("ATM closed. Thanks, come again!");
    }
}
