package hilosBasicos;

public class HilosPrincipal {

	public static void main(String[] args) throws InterruptedException {
		HilosOpciones hilos1 = new HilosOpciones(1);
		HilosOpciones hilos2 = new HilosOpciones(2);
		HilosOpciones hilos3 = new HilosOpciones(3);
		HilosOpciones hilos4 = new HilosOpciones(4);
		
		hilos1.start();
		Thread.sleep(10);
		hilos2.start();
		Thread.sleep(10);
		hilos3.start();
		Thread.sleep(10);
		hilos4.start();
		Thread.sleep(10);
	}

}
