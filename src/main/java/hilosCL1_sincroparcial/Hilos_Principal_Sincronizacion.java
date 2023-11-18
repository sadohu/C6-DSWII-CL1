package hilosCL1_sincroparcial;

public class Hilos_Principal_Sincronizacion {

	public static void main(String[] args) throws InterruptedException {
		Hilos_sincronizacionI sincronizacionI = new Hilos_sincronizacionI();
		Hilos_sincronizacionII sincronizacionII = new Hilos_sincronizacionII();
		Hilos_sincronizacionIII sincronizacionIII = new Hilos_sincronizacionIII();
		Hilos_sincronizacionIV sincronizacionIV = new Hilos_sincronizacionIV();
		Hilos_sincronizacionV sincronizacionV = new Hilos_sincronizacionV();
		Hilos_sincronizacionVI sincronizacionVI = new Hilos_sincronizacionVI();
		Hilos_sincronizacionVII sincronizacionVII = new Hilos_sincronizacionVII();

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
