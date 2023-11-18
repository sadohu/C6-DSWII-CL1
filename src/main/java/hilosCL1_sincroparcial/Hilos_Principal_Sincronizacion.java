package hilosCL1_sincroparcial;

public class Hilos_Principal_Sincronizacion {

	public static void main(String[] args) throws InterruptedException {
		Thread sincronizacionI = new Thread(new Hilos_sincronizacionI());
		Thread sincronizacionII =  new Thread(new Hilos_sincronizacionII());
		Thread sincronizacionIII =  new Thread(new Hilos_sincronizacionIII());
		Thread sincronizacionIV =  new Thread(new Hilos_sincronizacionIV());
		Thread sincronizacionV =  new Thread(new Hilos_sincronizacionV());
		Thread sincronizacionVI =  new Thread(new Hilos_sincronizacionVI());
		Thread sincronizacionVII =  new Thread(new Hilos_sincronizacionVII());

		sincronizacionI.start();
		Thread.sleep(100);
		sincronizacionII.start();
		Thread.sleep(100);
		sincronizacionIII.start();
		Thread.sleep(100);
		sincronizacionIV.start();
		Thread.sleep(100);
		sincronizacionV.start();
		Thread.sleep(100);
		sincronizacionVI.start();
		Thread.sleep(100);
		sincronizacionVII.start();
		Thread.sleep(100);
	}

}
