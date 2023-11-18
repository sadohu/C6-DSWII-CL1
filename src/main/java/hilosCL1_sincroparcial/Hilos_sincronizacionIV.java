package hilosCL1_sincroparcial;

public class Hilos_sincronizacionIV extends Thread implements Runnable{

	public void run() {
		for(int i = 1; i <= 7; i++){
			System.out.println(i + ": Soy Emprendedor 4");
			try {
				Hilos_sincronizacionIV.sleep(1000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	}
}
