package q;

import java.io.File;
import java.io.FileOutputStream;

public class D {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		System.out.println("Hi");
		new File("./D1").mkdir();
		System.out.println("Directory Created");
		Thread.sleep(2000);
		FileOutputStream out = new FileOutputStream("./D1/f.txt");
		out.write("bhanu".getBytes());
		out.close();
		System.out.println("File Created");
	}

}
