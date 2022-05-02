package threadprojects;

class myClass1 extends Thread{
	int result;
	public void run(){
		synchronized (this) {
			for (int i=0;i<20;i++) {
			result = result+i;
		}
		notify();
		}
		}
}

public class WaitandNotify {
	public static void main(String[] args) throws InterruptedException {
	myClass1 cls = new myClass1();
	System.out.println("before start method");
	cls.start();
	synchronized (cls) {
		System.out.println("wait for the result..!");
		cls.wait();
		System.out.println("result is: "+cls.result);
	}
	}

}
