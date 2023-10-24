package task3.com;

import java.util.Scanner;

public class AtmMachine extends BankAccount {
    static Scanner f=new Scanner(System.in);
    static boolean flag=true;
   static AtmMachine n=new AtmMachine();
	public static void main(String[] args) {
		
       do {
		System.out.println("ATM");
		System.out.println("1.Withdraw\n2.Deposite\n3.CheckBalance\n4.exit");
		switch (f.nextInt()) {
		case 1: {			
			n.withdraw();
			break;
		}
		case 2: {
			System.out.println("How much money you want to Deposite");
			int deposite=f.nextInt();
			n.deposite(deposite);
			break;
		}
		case 3: {
			System.out.println("The Balance Amount is"+n.checkBalance());
			break;
		}
		case 4: {
			flag=false;
			break;
		}
		}
	} while (flag);
	}
	@Override
	public void withdraw() {
		if(n.balance>500) {
			System.out.println("How much money you want to withdraw");
			int withdraw=f.nextInt();
			if(n.balance>=withdraw)
			{
				n.balance=n.balance-withdraw;
				System.out.println(withdraw+"the money is withdrawed");	
			}
			else {
				System.out.println("not enough balance");
			}
		}
		else
		{
			System.out.println("withdrawel denied because of low balance  :"+n.balance);
		}
		
	}
	@Override
	public void deposite(int deposite) {
		n.balance=n.balance+deposite;
		System.out.println(deposite+"Rupee is deposited");
	}
	@Override
	public int checkBalance() {
		
		return n.balance;
	}


	

}
