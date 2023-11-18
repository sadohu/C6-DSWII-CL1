package hilosBasicos;

public class Martin extends Thread implements AtletaAficionado {
	
	@Override
	public void run() {
		correr();
	}

	public void correr() {
		int[] km = {2};
		for (int i = 0; i < km.length; i++) {
			System.out.println("Opción 4: Martín recorre " + km[i] + " km");
		}
	}
}
