package fileHandling;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class FileHandle {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		File folder = new File("D:\\Javafilehandling");
		folder.mkdir();
		
		File f1 = new File(folder,"student.txt");
		
			f1.createNewFile();
		
		File f2 = new File(folder,"Employee.txt");
		
			f2.createNewFile();
		
		if(folder.exists()) {
			File[] fileList = folder.listFiles();
			for(int i=0;i<fileList.length;i++) {
				System.out.println(fileList[i]);
			}
		}
		
		//write data in file
		
		//1st way
		FileWriter writer = new FileWriter(f1);
		
			writer.write("Hey Ankesh");
			writer.close();
		
		//2nd way using BufferWrite and it will override the content of 1st method data.
		BufferedWriter bw = new BufferedWriter(new FileWriter(f1));
			
				bw.write("Bye Ankesh");
				bw.newLine();
				bw.write("Good Morning Everyone \nHave a nice day");
				bw.close();
				
		//Read the File
				BufferedReader br = new BufferedReader(new FileReader(f1));
				String line;
				while((line = br.readLine()) != null) {
					System.out.println(line);
				}
				br.close();
	}

}
