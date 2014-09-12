import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

public class PersonMain {
	public static void main(String[] args) {
		Person[] person = new Person[3];
		person[0] = new Person("kushal", 100);
		person[1] = new Person("Suraj", 200);
		person[2] = new Person("Upen", 300);

//		try {
//			ObjectOutputStream out = new ObjectOutputStream(
//					new FileOutputStream("Person.txt"));
//			out.writeObject(person);
//			out.close();
//			System.out.println("written to the file");
//		} catch (IOException e) {
//			System.out.println("File cannot be created or opened ..KP");
//			e.printStackTrace();
//		}

		try {
			ObjectInputStream read = new ObjectInputStream(new FileInputStream(
					"Person.txt"));
			Person[] kushal = (Person[]) read.readObject();
			read.close();

			for (Person per : kushal) {
				System.out.println(per);
			}

		} catch (FileNotFoundException e) {
			System.out.println("file couldn't be found..");
			e.printStackTrace();
		} catch (IOException e) {
			System.out.println("file couldn't be read");
			e.printStackTrace();
		} catch (ClassNotFoundException e) {
			System.out.println("Class not found re");
			e.printStackTrace();
		}
	}
}
