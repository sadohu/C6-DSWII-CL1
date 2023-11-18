package pc_servidor;

import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.net.ServerSocket;
import java.net.Socket;

public class Servidor {

	public static void main(String[] args) throws ClassNotFoundException {
		try {
			ServerSocket server = new ServerSocket(4780);
			System.out.println("Servivor a la espera de peticiones.");
			Socket client = server.accept();
			
			ObjectInputStream requets = new ObjectInputStream(client.getInputStream());
			System.out.println("Requets recibido.");
			
			String message = (String) requets.readObject();
			System.out.println("Mensaje desde el cliente: " + message);
			
			ObjectOutputStream response = new ObjectOutputStream(client.getOutputStream());
			response.writeObject("Hola cliente, el presidente fue Ramón Castilla.");
			System.out.println("Respuesta enviada.");

			client.close();
			server.close();
			System.out.println("Servivor apagado.");
			
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}
