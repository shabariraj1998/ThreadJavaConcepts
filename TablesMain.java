package threadprojects;

class Tables{
	synchronized void print(int num, String st){
	for(int i =1;i<=10; i++) {
		System.out.println(num+" x "+i+ " = " +num*i +" strings is:"+st);
	}
	}
}
class  FirstThread extends Thread{
	Tables t;
	public FirstThread(Tables te) {
		this.t = te;
	}
	public void run() {
		t.print(4,"nlsr");
	}
}
class  secondThread extends Thread{
	Tables t;
	public secondThread(Tables te) {
		this.t = te;	
	}
	public void run() {
		t.print(6,"welcome");
	}
}
	

public class TablesMain {
	public static void main(String[] args) {
		Tables te = new Tables();
		FirstThread t1 = new FirstThread(te);
		secondThread t2 = new secondThread(te);
		t1.start();
		t2.start();
	}
}
