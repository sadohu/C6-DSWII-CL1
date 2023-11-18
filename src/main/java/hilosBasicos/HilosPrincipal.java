package hilosBasicos;

public class HilosPrincipal {

	public static void main(String[] args) throws InterruptedException {
		HilosOpciones hilos1 = new HilosOpciones(1);
		HilosOpciones hilos2 = new HilosOpciones(2);
		HilosOpciones hilos3 = new HilosOpciones(3);
		HilosOpciones hilos4 = new HilosOpciones(4);
		
		hilos1.start();
		//hilos2.start();
		//hilos3.start();
		//hilos4.start();
	}

}
