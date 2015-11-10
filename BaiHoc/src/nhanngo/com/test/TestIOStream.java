package nhanngo.com.test;

import nhanngo.com.inputoutput.ReadWriteFile;

public class TestIOStream {
	
	public static void main(String[] args) {
		ReadWriteFile objRead=new ReadWriteFile();
		objRead.readFile("D:/Test.txt");
		
		objRead.writeFile("D:/Test2.txt", "Ghi lai lan 2!");
		System.out.println("Noi dung da ghi");
		objRead.readFile("D:/Test2.txt");
	}
	
	
}
