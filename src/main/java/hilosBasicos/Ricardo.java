package hilosBasicos;

public class Ricardo extends Thread implements AtletaAficionado {
	
	@Override
	public void run() {
		correr();
	}

	public void correr() {
		int[] km = {2, 3 , 4 ,5};
		for (int i = 0; i < km.length; i++) {
			System.out.println("Opción 4: Ricardo recorre " + km[i] + " km");
		}
	}
}