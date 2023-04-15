import java.io.IOException;
import java.util.Scanner;
import java.util.ArrayList;
class Account {
	int accNum;
	String accHolderName;
	double balField ;

	public Account( int an , String ahn ,double bf)
	{
		accNum = an;
		accHolderName=ahn;
		balField = bf;
		
	}
	public void deposit(double val){
	
		balField+=val;
		System.out.println("Deposit successful. Your new balance is : " + balField);
	}
		public void withdraw(double val){
			if (val >= balField) 
				System.out.println("Withdrawal failed. Insufficient funds.");
			else{
				balField-=val;
				System.out.println("Withdrawal successful. Your new balance is : " + balField);
	}
		}
	
}



class SavingsAcc extends Account {
	int interestRate;
	
	public SavingsAcc( int an , String ahn ,double bf,int ir)
	{	super(an, ahn, bf);
		interestRate=ir;
		System.out.println("You have made a saving account with an interest rate = " + interestRate + "");
	    balField+=(interestRate*0.01*balField);
	}
	public void calInterest(){
	
		
	    System.out.println("Your interest rate = " + interestRate + " and your balance after a year = " + balField+" ");

	}

	
	
}


class Bank {
	
	ArrayList<Account> account = new ArrayList<>();	
		
		
	public Bank( )
	{
		
	}
	public void addAcc(int an , String ahn ,double bf,int ir){
	
		account.add(new SavingsAcc(an, ahn,bf,ir));
	    //System.out.println("Your account is created successfuly ");

	}
	public void deposit(int accNumb ,double val){
		 for (Account acc : account) {
            if (acc.accNum == accNumb) {
                acc.deposit(val);
            }
			else 
				System.out.println("There is no account number with number " + accNumb + " ");
	
        }
	
	
	
	}
	public void withdraw(int accNumb ,double val){
	
		for (Account acc : account) {
            if (acc.accNum == accNumb) {
                acc.withdraw(val);
            }
			else 
				System.out.println("There is no account number with number " + accNumb + " ");
	
	}
	}
	public void display(int accNumb ){
		 for (Account acc : account) {
            if (acc.accNum == accNumb) {
                System.out.println("Your account name is " + acc.accHolderName + " And your balance is " + acc.balField + " ");
            }
			else 
				System.out.println("There is no account number with number " + accNumb + " ");
	
        }
	
	}
} 

class BankApplication {
    public static void main(String[] args) {
        Bank bank = new Bank();
        Scanner scanner = new Scanner(System.in);
        boolean quit = false;
        while (!quit) {
            System.out.println("1. Open a new account");
            System.out.println("2. Deposit money");
            System.out.println("3. Withdraw money");
            System.out.println("4. Display account balance");
            System.out.println("5. Exit");
            System.out.print("Enter your choice: ");
            int choice = scanner.nextInt();
            switch (choice) {
				case 1:
                    System.out.print("Enter account number: ");
                    int accountNumber = scanner.nextInt();
					scanner.nextLine();
                    System.out.print("Enter account holder name: ");
                    String accountHolderName = scanner.nextLine();
						//scanner.nextLine();
                    System.out.print("Enter initial balance: ");
                    double balance = scanner.nextDouble();
                    System.out.print("Enter interest rate: ");
                    int interestRate = scanner.nextInt();
                    bank.addAcc(accountNumber,accountHolderName,balance,interestRate);
					System.out.println("Account created successfully.");
                    break;
                case 2:
                    System.out.print("Enter account number: ");
                    accountNumber = scanner.nextInt();
                    System.out.print("Enter deposit amount: ");
                    double depositAmount = scanner.nextDouble();
                    bank.deposit(accountNumber, depositAmount);
                    break;
                case 3:
                    System.out.print("Enter account number: ");
                    accountNumber = scanner.nextInt();
                    System.out.print("Enter withdrawal amount: ");
                    double withdrawalAmount = scanner.nextDouble();
                    bank.withdraw(accountNumber, withdrawalAmount);
                    break;
                case 4:
                    System.out.print("Enter account number: ");
                    accountNumber = scanner.nextInt();
                    bank.display(accountNumber);
                    break;
                case 5:
                    quit = true;
                    System.out.println("Exiting application...");
                    break;
                default:
                    System.out.println("Wrong choice , Please enter a number from the choices");
            }
        }
    }
					
					
}				
					
					
					