package hilosCL1_sincroparcial;

public class Hilos_sincronizacionIII extends Thread implements Runnable{

	public void run() {
		for(int i = 1; i <= 7; i++){
			System.out.println(i + ": Soy Emprendedor 5");
			try {
				Hilos_sincronizacionIII.sleep(1000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	}

}
