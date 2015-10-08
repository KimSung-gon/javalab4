package kr.ac.embedded.kookmin.exception;

class Bank {
	private static final Exception Exception = null;
	private int balance = 1000;
	public void oneqTrade() {
		tradeWithA();
		tradeWithB();
		tradeWithC();
		
		catch(Exception e){
			System.out.println("�ŷ��� �����߻�");
			cancelA();
			cancelB();
			cancelC();
		}
		
		System.out.println("�ܿ� �ݾ� : " + balance); // ���� �߻��� �ܿ��ݾ��� ó�� �ݾװ� ���� �ϰ� �ʹ�.
	}
	
	public void tradeWithA () {
		int m = 100; // A���¿��� ����� �ݾ�
		System.out.println("A ���¿��� ��� - " + m);
		balance -= m;
		
	}
	public void tradeWithB() {
		int m = 200;
		System.out.println("B ���¿��� ��� - " + m);
		balance -= m;
		
	}
	public void tradeWithC() throws Exception {
		int m = 300;
		System.out.println("C ���¿��� ��� - " + m);
		balance -= m;
		if();
	}
    public void cancelA() {
		System.out.println("A ���� �ŷ� ���  ");
		balance += 100;
	}
	public void cancelB() {
		System.out.println("B ���� �ŷ� ���  ");
		balance += 200;
	}
	public void cancelC() {
		System.out.println("C ���� �ŷ� ���  ");
		balance += 300;
	}
}
