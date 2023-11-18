package hilosCL1_sincroparcial;

public class Hilos_sincronizacionI extends Thread implements Runnable{

	public void run() {
		for(int i = 1; i <= 7; i++){
			System.out.println(i + ": Soy Emprendedor 7");
			try {
				Hilos_sincronizacionI.sleep(1000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	}

}
