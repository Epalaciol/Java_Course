package es.pildoras.pruebaannotations;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class UsoAnnotations2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
//		ClassPathXmlApplicationContext contexto = new ClassPathXmlApplicationContext("applicationContext.xml");
		
		// leer el class de configuration
		
		AnnotationConfigApplicationContext  contexto = new AnnotationConfigApplicationContext(EmpleadosConfig.class);
		
		// pedir el bean al contenedoe
		
		DirectorFinanciero empleado = contexto.getBean("directorFinanciero",DirectorFinanciero.class);
		
		
		System.out.println(empleado.getTareas());
		
		System.out.println(empleado.getInforme());
		
		System.out.println(empleado.getEmail());
		
		System.out.println(empleado.getNombreEmpresa());
		
		
		
		
		
		
		
//		Empleados Antonio=contexto.getBean("comercialExperimentado", Empleados.class);
//		
//		Empleados Lucia=contexto.getBean("comercialExperimentado", Empleados.class);
//		
//		
//		if(Antonio==Lucia) {
//			System.out.println("Apuntan al mismo lugar en Memoria");
//		}
//		else {
//			System.out.println("No apuntan al mismo lugar en memoria");
//			
//		}
//		System.out.println(Antonio + "\n"+ Lucia);
		
		//cerrar el contexto 
		contexto.close();


	}

}
