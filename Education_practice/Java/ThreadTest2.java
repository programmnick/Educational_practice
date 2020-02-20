import java.util.Random;

public class ThreadTest2 implements Runnable{

	int time; 
	String name;	
	Random r = new Random();
	
	public ThreadTest2(String name) {
		this.name = name;
		time = r.nextInt(999);
	}
	
	public void run() {		
		System.out.printf("Thread %s sleep %d\n", name, time);
		try {
			Thread.sleep(time);
		} catch (Exception e) {}
		System.out.printf("Thread %s woke up and ended %d\n", name, time);
	}

}
