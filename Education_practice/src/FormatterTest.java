import java.util.Scanner;
import java.util.Formatter;

public class FormatterTest {
		
	static Formatter x;
	static Scanner scn;		

	public static void main(String[] args) {		
		try {
			x = new Formatter("res//1.txt");
			scn = new Scanner(System.in);
			System.out.println("How old are you?");
			int a = (int)Double.parseDouble(scn.next());			
			System.out.println("What is your name?");
			String b = scn.next();
			System.out.println("Where do you live?");
			String c = scn.next();
			System.out.println();
			
			x.format("My name is %s, I am %d years old, i live in %s", b, a, c);
			x.close();
		} catch(Exception e) {}
	}	
}
