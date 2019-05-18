import java.io.*;

public class WriteFile{
	public static void main(String[] args) throws IOException {
		FileWriter out = null;

		try{
			out = new FileWriter("C:/WriteFile1.txt");
			String data = "This is a test message";
			out.write(data);
		}
		finally{
			out.close();
		}
		
	}
}