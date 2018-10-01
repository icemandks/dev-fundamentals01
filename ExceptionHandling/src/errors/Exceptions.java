package errors;

import java.io.FileReader;
import java.io.File;
import java.io.FileNotFoundException;

public class Exceptions {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		File file = new File("X:\\file.txt");
		try {
			FileReader fr = new FileReader(file);
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
