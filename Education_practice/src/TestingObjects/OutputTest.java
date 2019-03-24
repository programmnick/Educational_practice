package TestingObjects;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

public class OutputTest {
		
	public static void main(String[] args) throws IOException {
		FileOutputStream fileStream = new FileOutputStream("res//Chars.ser");
		ObjectOutputStream os = new ObjectOutputStream(fileStream);
		Object characterOne = "elf";
		os.writeObject(characterOne);
		Object characterTwo = "orc";
		os.writeObject(characterTwo);
		Object characterThree = "mage";
		os.writeObject(characterThree);
		os.close();				
	}
}