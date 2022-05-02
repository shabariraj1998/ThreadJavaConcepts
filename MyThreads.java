package threadprojects;

class threadProgram extends Thread{
	@Override
	public void run() {
		for (int i=1;i<=5;i++) {
			System.out.println("run method "+Thread.currentThread() +" i= "+i);
		}
		try {
			Thread.sleep(5000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}
	void display() {
		System.out.println("Display Threads"+Thread.currentThread());
	}
}

public class MyThreads {
	public static void main(String[] args) throws InterruptedException {
		System.out.println("jvm thread:"+Thread.currentThread());
			threadProgram tp = new threadProgram();
			threadProgram tp1 = new threadProgram();
			//changing the name for the thread class
			tp.setName("nlsr");
			tp1.setName("shabari");
			System.out.println("status of first thread"+tp.isAlive());
			tp.start();
			System.out.println("status of first thread"+tp.isAlive());
			tp.join();
			System.out.println("status of first thread"+tp.isAlive());
			tp1.start();
			
	}

}
