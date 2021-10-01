package es.pildoras.IoC;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class UsoDemoSingletoPrototype {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		ClassPathXmlApplicationContext contexto = new ClassPathXmlApplicationContext("applicationContext2.xml");
		
		//Peticion de beans al contenedor
		
		SecretarioEmpleado Maria =contexto.getBean("miSecretarioEmpleado", SecretarioEmpleado.class);

		SecretarioEmpleado Pedro =contexto.getBean("miSecretarioEmpleado", SecretarioEmpleado.class);
		
		System.out.println(Maria);
		
		System.out.println(Pedro);
	
		if (Maria == Pedro) System.out.println("Apuntan al mismo objeto");
		else System.out.println("Son objetos Distintos");
	}

}
