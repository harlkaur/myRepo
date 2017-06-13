package Serialization;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

public class sampleSerialize {
	public static void main(String[] args) {
		try {
			Student ss = new Student("1","Harleen","IT");
			FileOutputStream fos = new FileOutputStream("C:\\Users\\hkaur6\\Student.txt");
			ObjectOutputStream oos = new ObjectOutputStream(fos);
			oos.writeObject(ss);

			System.out.println("ObjectOutputSTream:: "+ ss.getId());
			FileInputStream fis = new FileInputStream("C:\\Users\\hkaur6\\Student.txt");
			ObjectInputStream ois = new ObjectInputStream(fis);
			Student ss1 = (Student) ois.readObject();
			
			System.out.println(ss1);
		}

		catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		}
		finally{
			/*oos.close();
			ois.close();*/
		}
	}
}
