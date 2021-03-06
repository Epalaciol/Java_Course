package es.pildoras.IoC;

public class DirectorEmpleado implements Empleados {
	
	//Creacion de camppo ripo creacionInforme
	
	private CreacionInformes infomeNuevo;
	
	private String email;
	
	private String nombreEmpresa;
	

	public String getEmail() {
		return email;
	}


	public void setEmail(String email) {
		this.email = email;
	}


	public String getNombreEmpresa() {
		return nombreEmpresa;
	}


	public void setNombreEmpresa(String nombreEmpresa) {
		this.nombreEmpresa = nombreEmpresa;
	}
	
	
	//Creaci?n de constructor que inyecta la dependencia
	public DirectorEmpleado(CreacionInformes informeNuevo) {
		// TODO Auto-generated constructor stub
		
		this.infomeNuevo= informeNuevo;
	}

	@Override
	public String getTareas() {
		// TODO Auto-generated method stub
		return "Gestionar la plantilla de la empresa";
	}

	@Override
	public String getInforme() {
		// TODO Auto-generated method stub
		return "Informe Creado por el director: "+ infomeNuevo.getInforme();
	}
	
	//metodo init. Ejecutar tareas antes de que el bean este disponible 
	
	public void metodoInicial() {
		
		System.out.println("Dentro del metodo init, aqui van las tareas a ejecutar antes de que el bean este listo ");
	}
	
	
	//metodo destroy. Ejecutar tareas despues de que el bean haya sido utilizado
	
	public void metodoFinal() {
		
		System.out.println("Dentro del metodo init, aqui van las tareas a ejecutar despues de ejecutar el bean ");
	}

}
