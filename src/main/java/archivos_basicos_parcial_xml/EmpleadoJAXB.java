package archivos_basicos_parcial_xml;

import java.io.File;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Marshaller;
import javax.xml.bind.Unmarshaller;

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
			System.out.println("Archivo XML generado\n");
			
		} catch (JAXBException e) {
			System.out.println("Error en marshal: " + e.getMessage());
		}
	}
	
	public void unmarshal(){
		try {
			JAXBContext reader = JAXBContext.newInstance(Empleado.class);
			Unmarshaller unmarshaller = reader.createUnmarshaller();
			
			File xmlFile = new File("src/datos_empleado_xml/empleado.xml");
			Empleado empleado = (Empleado)unmarshaller.unmarshal(xmlFile);
			
			String bono = "";
			if(empleado.getSueldo() < 1025.00){
				empleado.setSueldo(1025.00);
				bono = "Sí tiene bono";
			}else if(empleado.getSueldo() < 1600){
				bono = "Tiene bono";
			}else{
				bono = "No tiene bono";
			}
			
			System.out.println("Lectura Archivo XML"
					+ "\nidEmpleado: " + empleado.getIdEmpleado() 
					+ "\nnombre: " + empleado.getNombre() 
					+ "\napellido: " + empleado.getApellido() 
					+ "\ntelefono: " + empleado.getTelefono() 
					+ "\ndireccion: " + empleado.getDireccion() 
					+ "\nobservaciones: " + empleado.getObservaciones() 
					+ "\nsueldo: " + empleado.getSueldo() 
					+ "\nfondo: " + bono);
		} catch (JAXBException e) {
			e.printStackTrace();
		}
	}
}
