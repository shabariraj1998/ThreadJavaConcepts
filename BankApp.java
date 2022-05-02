package threadprojects;

class myBank extends Thread{
	static int Amount = 7000;
	synchronized void deposit(int dp) {
		Amount = Amount+dp;
		notify();
		System.out.println("deposited amount:" +Amount);
	}
	synchronized void withdraw(int wd) throws InterruptedException {
		if(wd<Amount) {
			System.out.println("wait for withdraw your amount:"+wd);
			Amount -=wd;
			System.out.println("balance amount:"+Amount);
			wait();
		}
		else {
			System.out.println("Insufficient balance..!");
		}
	}
	
}

public class BankApp {
	public static void main(String args[]) {
		myBank mob = new myBank();
		System.out.println("Deposit and withdraw");
		new Thread() {
			public void run()
			{
				System.out.println("deposit amount: ");
				mob.deposit(23000);
			}
		}.start();
		new Thread() {
			public void run() {
				System.out.println("withdraw amount: ");
				try {
					mob.withdraw(8530);
				}
				catch(InterruptedException e) {
					e.printStackTrace();
				}
			}
		}.start();
	}
}
