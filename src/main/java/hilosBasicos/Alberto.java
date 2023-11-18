package hilosBasicos;

public class Alberto extends Thread implements AtletaAficionado {
	
	@Override
	public void run() {
		correr();
	}

	public void correr() {
		int[] km = {7 ,8 ,9};
		for (int i = 0; i < km.length; i++) {
			System.out.println("Opción 4: Alberto recorre " + km[i] + " km");
		}
	}
}
