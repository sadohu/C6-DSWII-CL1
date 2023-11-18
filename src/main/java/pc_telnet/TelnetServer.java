package pc_telnet;

import java.io.BufferedReader;
import java.io.DataOutputStream;
import java.io.InputStreamReader;
import java.net.ServerSocket;
import java.net.Socket;

public class TelnetServer {
	private ServerSocket server;
	private Socket socket;
	private static final int PORT = 62000;
	private DataOutputStream response;
	private BufferedReader request;
	
	public void start(){
		System.out.println("Esperando por conexión del cliente");
		try {
			server = new ServerSocket(PORT);
			socket = new Socket();
			socket = server.accept();
			
			request = new BufferedReader(new InputStreamReader(socket.getInputStream()));
			String message = request.readLine();
			System.out.println("Mensaje del cliente: " + message);
			
			response = new DataOutputStream(socket.getOutputStream());
			response.writeUTF("Respuesta del servidor: " + message);
			socket.close();
		} catch (Exception e) {
			System.out.println("Error: " + e.getMessage());
		}
	}
}
