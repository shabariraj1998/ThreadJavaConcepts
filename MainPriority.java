package threadprojects;

class priorcheck extends Thread{
	public void run() {
		System.out.println("run method"+Thread.currentThread());
	}
}

public class MainPriority {
	public static void main(String[] args) {
		priorcheck pc = new priorcheck();
		System.out.println("check priority");
		System.out.println("main method"+Thread.currentThread());
		System.out.println("min priority:"+Thread.MIN_PRIORITY);
		pc.start();
	}

}
