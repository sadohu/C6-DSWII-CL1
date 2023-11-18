package hilosBasicos;

public class HilosPrincipal {

	public static void main(String[] args) {
		HilosOpciones hilos1 = new HilosOpciones(1);
		//hilos1.start();
		HilosOpciones hilos2 = new HilosOpciones(2);
		//hilos2.start();
		HilosOpciones hilos3 = new HilosOpciones(3);
		hilos3.start();
	}

}
