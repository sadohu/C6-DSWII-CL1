package hilosCL1_sincroparcial;

public class Hilos_sincronizacionV extends Thread implements Runnable{

	public void run() {
		for(int i = 1; i <= 7; i++){
			System.out.println(i + ": Soy Emprendedor 3");
			try {
				Hilos_sincronizacionV.sleep(1000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	}

}
