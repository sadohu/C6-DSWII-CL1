package hilosCL1_sincroparcial;

public class Hilos_sincronizacionIV implements Runnable{

	public void run() {
		for(int i = 1; i <= 7; i++){
			synchronized(this){
				System.out.println("4 Soy Emprendedor 4");
				try {
					this.wait(1000);
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
			}
		}
	}
}
