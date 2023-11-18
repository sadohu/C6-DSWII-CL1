package hilosCL1_sincroparcial;

public class Hilos_sincronizacionVII implements Runnable{

	public void run() {
		for(int i = 1; i <= 7; i++){
			synchronized(this){
				System.out.println("7 Soy Emprendedor 1\n");
				try {
					this.wait(1000);
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
			}
		}
	}

}
