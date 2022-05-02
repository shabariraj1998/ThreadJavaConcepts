package threadprojects;

public class YieldExp extends Thread  
{  
    public void run()  
    {  
        for (int i=0; i<3 ; i++)  
            System.out.println(Thread.currentThread().getName() + "run in control");  
    }  
    public static void main(String[]args)  
    {  
    	YieldExp t1 = new YieldExp();  
    	YieldExp t2 = new YieldExp();  
        // this will call run() method  
        t1.start();  //runnable 
        t2.start();  //runnable
        for (int i=0; i<3; i++)  
        {  
            // Control passes to child thread  
            t1.yield();  
            t2.yield();
            System.out.println(Thread.currentThread().getName() + " Main in control");  
        }  
    }  
}
	
