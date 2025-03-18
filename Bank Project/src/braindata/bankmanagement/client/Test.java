package braindata.bankmanagement.client;

import braindata.bankmanagement.service.Rbi;
import braindata.bankmanagemeent.serviceImpl.Sbi;

import java.util.Scanner;

public class Test {
    public static void main(String[] args) {
        Rbi bank = new Sbi();
        Scanner scanner = new Scanner(System.in);
        int choice;
        
 
        do {
            System.out.println("\n*** Bank Operations ***");
            System.out.println("1. Create Account");
            System.out.println("2. Display All Details");
            System.out.println("3. Deposit Money");
            System.out.println("4. Withdraw Money");
            System.out.println("5. Check Balance");
            System.out.println("6. Exit ");
            System.out.print("Enter your choice: ");
            
            choice = scanner.nextInt();
            
            
            switch (choice) {
                case 1:
                    bank.createAccount();
                    break;
                case 2:
                    bank.displayAllDetails();
                    break;
                case 3:
                    bank.depositMoney();
                    break;
                case 4:
                    bank.withdrawal();
                    break;
                case 5:
                    bank.balanceCheck();
                    break;
                case 6:
                    System.out.println("Exiting the system.");
                    break;
                default:
                    System.out.println("Invalid choice! Please try again.");
            }
        } while (choice != 6);
        
        scanner.close();
    }
}