package pc_cliente;

import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.net.Socket;
import java.net.UnknownHostException;

public class Cliente {
	
	public static void main(String[] args) throws ClassNotFoundException {
		try {
			Socket client = new Socket("localhost", 4500);
			ObjectOutputStream request = new ObjectOutputStream(client.getOutputStream());
			request.writeObject("Hola Servidor, consulta ¿Quién fue el presidente del Perú en 1844?");
			System.out.println("Solicitud enviada.");
			
			ObjectInputStream response = new ObjectInputStream(client.getInputStream());
			String message = (String) response.readObject();
			System.out.println("Respuesta del servidor: " + message);
			
			client.close();
			
		} catch (UnknownHostException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}
