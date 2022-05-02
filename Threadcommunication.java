package threadprojects;

class Myclass extends Thread{
	int total;
	public void run() {
		synchronized (this) {
			for (int i = 0 ; i<=20;i++) {
				total+=i;
			}
			notify();
		}
	}
}

public class Threadcommunication {
	public static void main(String[] args) throws InterruptedException {
			Myclass t = new Myclass();
			t.start();
			synchronized (t) {
				System.out.println("waiting for total");
				t.wait();
				System.out.println("total is : "+t.total);
			}
	}

}
