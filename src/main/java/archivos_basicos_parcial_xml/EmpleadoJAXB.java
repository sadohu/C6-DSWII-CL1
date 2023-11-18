package archivos_basicos_parcial_xml;

import java.io.File;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Marshaller;

public class EmpleadoJAXB {

	public void marshal(Double sueldo){
		Empleado empleado = new Empleado();
		empleado.setSueldo(sueldo);
		try {
			JAXBContext context = JAXBContext.newInstance(Empleado.class);
			Marshaller marshaller = context.createMarshaller();
			marshaller.setProperty(Marshaller.JAXB_FORMATTED_OUTPUT, true);
			File xmlFile = new File("src/datos_empleado_xml/empleado.xml");
			marshaller.marshal(empleado, xmlFile);
			System.out.println("Archivo XML generado");
			
		} catch (Exception e) {
			System.out.println("Error en marshal: " + e.getMessage());
		}
	}
	
	public void unmarshal(){
			
	}
}
