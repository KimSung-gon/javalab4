package kr.ac.kookmin.exception.basicthread;

public class testMain {
	
	public static BankAccount account = new BankAccount();
	public static void main (String []args) {

		Thread depositMan = new Thread() {
            public void run() {
                while (true) {
                	try {
						sleep(500);
					} catch (InterruptedException e) {
						e.printStackTrace();
					}
                	account.add(10);
                }
            }
        };
        Thread withdrawMan = new Thread() {
            public void run() {
                while (true) {
                	try {
						sleep(500);
					} catch (InterruptedException e) {
						e.printStackTrace();
					}
                	account.delete(10);
                }
            }
        };
        depositMan.start();
        withdrawMan.start();
	}
}
