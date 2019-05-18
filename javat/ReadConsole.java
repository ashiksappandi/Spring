import java.io.*;

public class ReadConsole{
 //Read files at specified directory

	public static void main(String[] args) {
		String[] paths;
		File file = null;

		try{
			file = new File("C:/Users/narayaa/OneDrive - IG Index Ltd/Documents/Spring/javata");
			paths = file.list();
			for(String path:paths)
			{
				System.out.println(path);
			}
		}
		catch(Exception e){
			e.printStackTrace();
		}
	}



/*	public static void main(String[] args) throws IOException {
		InputStreamReader cin = null;
		try{
			cin = new InputStreamReader(System.in);
			System.out.println("Enter q to quit");
			char c;
			do{
				c = (char) cin.read();
				if(c != 'q')
					System.out.println(c);

			}while(c != 'q');
		}finally
		{
			if(cin != null)
				cin.close();
		}
	}*/
}