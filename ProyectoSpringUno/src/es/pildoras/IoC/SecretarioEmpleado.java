package es.pildoras.IoC;


public class SecretarioEmpleado implements Empleados {
	
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


	public void setInformeNuevo(CreacionInformes infomeNuevo) {
		this.infomeNuevo = infomeNuevo;
	}
	

	@Override
	public String getTareas() {
		// TODO Auto-generated method stub
		return "Gestionar la agenda de los jefes";
	}

	@Override
	public String getInforme() {
		// TODO Auto-generated method stub
		return "Informe generado por el secretario " + infomeNuevo.getInforme();
	}
	
	

}
