package es.pildoras.pruebaannotations;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class UsoAnnotations {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//leer el xml de confoguracion
		ClassPathXmlApplicationContext contexto = new ClassPathXmlApplicationContext("applicationContext.xml");
		
		// pedir el bean al contenedoe
		
		Empleados Antonio=contexto.getBean("comercialExperimentado", Empleados.class);
		
		// usar el  bean
		System.out.println(Antonio.getInforme());
		
		System.out.println(Antonio.getTareas());
		
		//cerrar el contexto 
		contexto.close();

	}

}
