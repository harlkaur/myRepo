package Serialization;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

public class sampleExternalize {

	public static void main(String[] args) {
		try {
			User uu = new User("2", "Eshleen", "Banking");
			FileOutputStream fos = new FileOutputStream("C:\\Users\\hkaur6\\Student.txt");
			ObjectOutputStream oos = new ObjectOutputStream(fos);
			oos.writeObject(uu);

			FileInputStream fis = new FileInputStream("C:\\Users\\hkaur6\\Student.txt");
			ObjectInputStream ois = new ObjectInputStream(fis);
			
			User uu1 = (User) ois.readObject();;
			System.out.println("after serialization:: "+ uu);
		}

		catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		}
	}

}
