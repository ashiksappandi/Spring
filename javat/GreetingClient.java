import java.io.*;
import java.net.*;

public class GreetingClient{
	public static void main(String[] args) {
		String serverName = args[0];
		int port = Integer.parseInt(args[1]);
		try{
			System.out.println("Connecting to "+serverName+" on port "+port);
			Socket client = new Socket(serverName, port);
			System.out.println("Just connected to "+client.getRemoteSocketAddress());
			
			OutputStream outToServer = client.getOutputStream();
			DataOutputStream out = new DataOutputStream(outToServer);
			
			out.writeUTF("Hello from "+client.getLocalSocketAddress());

			InputStream inputFromServer = client.getInputStream();
			DataInputStream in = new DataInputStream(inputFromServer);

			System.out.println("Server says "+in.readUTF());
			client.close();
		}
		catch(IOException e){
			e.printStackTrace();
		}
	}
}