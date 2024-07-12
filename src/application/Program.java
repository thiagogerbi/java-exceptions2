package application;

import java.util.Locale;
import java.util.Scanner;

import entities.Account;
import exceptions.BusinessExceptions;

public class Program {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
			System.out.println("Enter account data");
			System.out.println();
			System.out.print("Number: ");
			int number = sc.nextInt();
			System.out.print("Holder: ");
			String holder = sc.next();
			System.out.print("Initial Balance: ");
			double balance = sc.nextDouble();
			System.out.print("Withdraw Limit: ");
			double withdrawLimit = sc.nextDouble();
			
			Account acc = new Account(number, holder, balance, withdrawLimit);
			
			System.out.println();
			System.out.print("Enter amount for withdraw: ");
			double amount = sc.nextDouble();
			
		try {
			acc.withdraw(amount);
			System.out.println(acc);
		}
		catch (BusinessExceptions e) {
			System.out.println(e.getMessage());
		}
		catch (RuntimeException e) {
			System.out.println("Unknown Error");
		}
		
		sc.close();

	}

}
