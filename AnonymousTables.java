package threadprojects;

class Table{
	synchronized void print(int num, String st){
	for(int i =1;i<=10; i++) {
		System.out.println(num+" x "+i+ " = " +num*i +" strings is:"+st);
	}
	}
}

public class AnonymousTables {
	public static void main(String[] args) {
		Table tab = new Table();
		Thread t = new Thread() {
		public void run() {
			System.out.println("inside run method");
			tab.print(3,"welcome");
		}
		};
		t.start();
		new Thread() {// Anonymous class and anonymous object.
			public void run() {
				tab.print(5,"everyone");
			}
		}.start();
		Runnable r = new Runnable() {

			@Override
			public void run() {
				tab.print(8,"by nlsr");
			}
			
		};
		new Thread(r).start();
	}

}
