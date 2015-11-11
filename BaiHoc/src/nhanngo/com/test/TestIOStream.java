package nhanngo.com.test;

import nhanngo.com.inputoutput.ReadWriteFile;

public class TestIOStream {
	
	public static void main(String[] args) {
		ReadWriteFile objRead=new ReadWriteFile();
		objRead.readFile("D:/Test.txt");
		
		System.out.println("Noi dung da ghi");
		objRead.readFile("D:/Test2.txt");
	}
	
	
}
