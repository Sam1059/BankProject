package braindata.bankmanagemeent.serviceImpl;

import java.util.Scanner;

import braindata.bankmanagement.service.Rbi;

public class Sbi implements Rbi {

	
	 Scanner sc = new Scanner(System.in);
    public void createAccount() {
        System.out.println("Creating an account in SBI...");
        System.out.println("Enter Account number :");
       
        String accno = sc.next();
        if (accno.length() == 13 ) {
           
        } else {
            System.out.println("Invalid account number! Please enter a 14-digit number.");
        }
    
        sc.nextLine();  
	   System.out.println("Enter name:");
	   String name=sc.nextLine();
	   
	   sc.nextLine();
	   System.out.println("Enter Adhar number :");
       
       String adharno = sc.next();
       if (adharno.length() == 12 ) {
       } else {
           System.out.println("Invalid adhar number! Please enter a 12-digit number.");
       }
       sc.nextLine();
       System.out.println("Enter Gender:-");
       String gender=sc.nextLine();
       if(gender.equalsIgnoreCase("male")|| gender.equalsIgnoreCase("M")) {
      
    	} 
       else if(gender.equalsIgnoreCase("female") || gender.equalsIgnoreCase("F")) {
    	} 
       else {
    	    System.out.println("Invalid input");
    	}
       System.out.println("Enter Balance");
       double balance=sc.nextDouble();
       if(balance>=1000.00) {
    	   System.out.println("Account created.");
       }else {
    	   System.out.println("Account not created.");
       }
       System.out.println("Account number: "+accno);
	  System.out.println("Client name:- "+name);
	  System.out.println("Adhar number:-"+adharno);
	  System.out.println("Gender:-"+gender);
	  System.out.println("Balance:- "+balance);
   }
    

  
    public void displayAllDetails() {
        System.out.println("Displaying all account details...");

    }

 
    public void depositMoney() {
        System.out.println("Depositing money...");
      
    }

   
    public void withdrawal() {
        System.out.println("Withdrawing money...");
           }

  
    public void balanceCheck() {
        System.out.println("Checking account balance...");
      
    }
}
