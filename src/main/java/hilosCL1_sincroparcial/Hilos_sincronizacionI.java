package hilosCL1_sincroparcial;

public class Hilos_sincronizacionI implements Runnable{

	public void run() {
		for(int i = 1; i <= 7; i++){
			synchronized(this){
				System.out.println("1 Soy Emprendedor 7");
				try {
					this.wait(1000);
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
			}
			
		}
	}

}
