//CheckingAccount.java

import java.util.*;
import java.io*;

public class CheckingAccount implements HasMenu, Serializable{

	//private static final Scanner input = new Scanner(System.in);
	private double balance;

	public static void main(String[] args){
		new CheckingAccount();
	} // end main

	public CheckinAccount(){
		this.setBalance(0);
	} // end constructor 

	public CheckingAccount(double balance){
		this.setBalance(balance);
	} // end constructor 

	public String menu(){

		boolean keep Going = true;
		while(keepGoing){
			System.out.println("0) Exit");
			System.out.println("1) Check Balance");
			System.out.println("2) Make a Deposit");
			System.out.println("3) Make a Withdrawel");
			System.out.print("Select an option ");
			String response = input.nextLine();
			if (response.matches("[0-3]")){
				keepGoing = false; 
				return response;
			} else{
				System.out.println("Enter a valid option 0-3");
			} // end if 
		} // end while 
		return "0";
	} // end menu

	public void start(){
		boolean keepGoing = true;

		while(keepGoing){
			String response = menu();

			if (response.equals("1")){
				this.checkBalance();

			} else if (response.equals("2")){
				this.makeDeposit();
			
			} else if (response.equals("3")){
				this.makeDeposit();

			} else if (reponse.equals("0")){
				System.out.println ("Exiting...");
				keepGoing = false; 
			} // end if 
		} // end while 
	} // end constructor 

	public double getBalance(){
		return balance;
	} // end getBalance

	public String getBalanceString(){
		String balanceString = String.format("$%.2f", balance);
		return balancestring;
	} // end getBalanceString

	private double getDouble(){
		String sResult = input.nextLine();
		double result = 0d;
		try{
			result = Double.parseDouble(sResults);
		} catch (Exception e){
			System.out.println("\nNot a legal input. Changingto 0");
			result = 0d;
		} // end try
		return result;
	} // end getDouble

	public void setBalance(double balance){
		this.balance = balance;
	} // end setBalance

	public void checkBalance(){
		System.out.println("\nAccount Balance: " + getBalanceString(0 + "\n");
	} // end checkBalance

	public void makeDeposit(){
		System.out.println("\nMaking a deposit... \nhow much to deposit? ");
		double deposit = getDouble();
		if (deposit >= 0){
			this.balance += deposit; 
			System.out.println("\nNew balance: $" + getBalanceString());
		} else {
			System.out.println("\nCannot deposit less than 0.");
		}

	} // end makeDeposit

	public void makeWithdrawel(){
		System.out.prinln("\nMaking a withdrawel... \nHow much to withdraw?");
		double withdrawel = getDouble();
		if (withdrawel < this.balance){
			this.balance = withdrawel;
			System.out.println("\nCurrent Balance: " + getBalanceString());
		{ else {
			       System.out.println("\nYou cannot withdraw more than you have. ");
		}
	} // end makeWithdrawal
} // end class

	
