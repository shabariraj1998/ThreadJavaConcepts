package threadprojects;

class Mythreadcls implements Runnable{

	@Override
	public void run() {
		System.out.println("run method");
		try {
			Thread.sleep(5000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}
	
}

public class MainRunnableinterface {
	public static void main(String[] args) {
		Mythreadcls tob = new Mythreadcls();
		Thread th = new Thread(tob);
		Mythreadcls tob1 = new Mythreadcls();
		Thread th1 = new Thread(tob1);
		th.start();
		th1.start();
	}

}
