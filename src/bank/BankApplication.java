package bank;

import java.util.Scanner;



class BankAccount
{
	int balance;
	int previoustransaction;
	String customername;
	int customerID;
	int total;
	String previouString;
	
	
	public void deposite()
	{
		System.out.println("------------------------------------------------");
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter your deposit amount:");
		int depositamount = scanner.nextInt();
		int deposit = depositamount;
		total = total + depositamount;
		previouString = deposit+ " "+ "has been deposited";
		System.out.println("------------------------------------------------");
		System.out.println('\n');
	}
	
	public void withdraw() 
	{
		System.out.println("------------------------------------------------");
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter your withdrawal amount:");
		int withdrawamount = scanner.nextInt();
		int withdraw = withdrawamount;
		System.out.print("Balance =");
		System.out.println(total - withdraw);
		previouString = withdraw + "  "+" has been withdraw";
		System.out.println("------------------------------------------------");
		System.out.println('\n');
	}
	public void previous()
	{
		System.out.println("------------------------------------------------");
		System.out.println(previouString);
		System.out.println("------------------------------------------------");
		System.out.println('\n');
	}
	

}




public class BankApplication {

	public static void main(String[] args) 
	{
		BankAccount resultAccount = new BankAccount();
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter your name:");
		String customername = scanner.next();
		
		System.out.println("Enter your Pin");
		int customerID = scanner.nextInt();
		
		while (true) {
		System.out.println("------------------------------------------------");	
		System.out.println("Enter your option:");
		System.out.println("A. Deposit");
		System.out.println("B. Withdraw");
		System.out.println("C. Previous Transaction");
		System.out.println("D. Exit");
		System.out.println("------------------------------------------------");
		
		char youroption = scanner.next().charAt(0);
		
		
		 
		
			if (youroption == 'A') 
			{
				resultAccount.deposite();
				
			}else if (youroption == 'B') 
			{
				resultAccount.withdraw();
			}else if (youroption == 'C') 
			{
				resultAccount.previous();
			}else if (youroption == 'E') 
			{
				System.out.println("Exit");
				break;
			}else {
				break;
			}
			
			
		}
		
		
		
		
	}

}
