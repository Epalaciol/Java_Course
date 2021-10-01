package es.pildoras.IoC;

public class JefeEmpleado implements Empleados {
	
	//Creacion de camppo ripo creacionInforme
	
	private CreacionInformes infomeNuevo;
	
	public JefeEmpleado(CreacionInformes infomeNuevo) {
		this.infomeNuevo = infomeNuevo;
	}

	public String getTareas() {
		
		return "Gestiono las cuestiones relativas a mis empleados de sección";
	}

	@Override
	public String getInforme() {
		// TODO Auto-generated method stub
		return "Informe Presentado por el jede con arreglos: " + infomeNuevo.getInforme();
	}

}
