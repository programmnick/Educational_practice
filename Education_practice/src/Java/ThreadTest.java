
public class ThreadTest {

	public static void main (String[] args) {		
		Thread t1 = new Thread(new ThreadTest2("1"));
		Thread t2 = new Thread(new ThreadTest2("2"));
		Thread t3 = new Thread(new ThreadTest2("3"));
		t1.start();
		t2.start();
		t3.start();
	}	
 }
