package hilosBasicos;

public class HilosOpciones extends Thread{
	private int opcion;

	public HilosOpciones(int opcion) {
		this.opcion = opcion;
	}
	
	@Override
	public void run() {
		switch(this.opcion){
		case 1:
			opcion1();
			break;
		case 2:
			opcion2();
			break;
		default:
			break;
		}
	}
	
	private void opcion1(){
		for (int i = 1; i <= 20; i++) {
			if(i % 2 == 0){
				System.out.println("Opción 1: " + i);
				try {
					sleep(1000);
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
			}
		}
	}
	
	private void opcion2(){
		for (char i = 'a'; i <= 'z' ; i++) {
			System.out.println("Opción 2: " + i);
		}
	}
}
