package archivos_basicos_parcial_xml;

public class Principal_Empleado {

	public static void main(String[] args) {
		EmpleadoJAXB empleadoJAXB = new EmpleadoJAXB();
		empleadoJAXB.marshal(1200.00);

	}

}
