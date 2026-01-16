package fileHandling;

import java.io.*;

public class Student implements Serializable {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	String name;
	int id;
		Student (){
			
		}
		Student(String name, int id) {
		super();
		this.name = name;
		this.id = id;
	}
	public static void main(String[] args) throws IOException, ClassNotFoundException {
		// TODO Auto-generated method stub
		Student s1 = new Student("Ankesh",12213063);
		File f5 = new File("D:\\Javafilehandling","StudentDetails.ser");
		f5.createNewFile();
		FileOutputStream foo = new FileOutputStream(f5);
		ObjectOutputStream out = new ObjectOutputStream(foo);
		out.writeObject(s1);
		out.close();
		
		FileInputStream fio = new FileInputStream(f5);
		ObjectInputStream in = new ObjectInputStream(fio);
		Student s = (Student) in.readObject();
		System.out.println("Name: "+s.name+"\nId: "+s.id);
		in.close();
		
		
	}

}
