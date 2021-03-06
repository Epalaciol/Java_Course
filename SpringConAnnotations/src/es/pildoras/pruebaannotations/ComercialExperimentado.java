package es.pildoras.pruebaannotations;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component
public class ComercialExperimentado implements Empleados {
	
	@Autowired
	@Qualifier("informeFinancieroTrim4")
	private CreacionInformeFinanciero nuevoInforme;
	
	//Ejecucion de c?digo despues de creaci?n del bean 
	
	@PostConstruct
	public void  ejecutaDespuesCreacion() {
		
		System.out.println("Ejecutado tras creaci?n de Bean");
	}
	
	//Ejecuci?n de codigo despues de apagado contenedor Spring 
	@PreDestroy
	public void ejecutaAntesDestruccion() {
		
		System.out.println("Ejecutando antes de la destruccion ");
	}
	
	
//	@Autowired
//	public ComercialExperimentado(CreacionInformeFinanciero nuevoInforme) {
//		this.nuevoInforme = nuevoInforme;
//	}	
	
//	@Autowired
//	public void setNuevoInforme(CreacionInformeFinanciero nuevoInforme) {
//		this.nuevoInforme = nuevoInforme;
//	}

	@Override
	public String getTareas() {
		
		return "Vender, vender y vender m?s";
	}
	

	@Override
	public String getInforme() {
		
		return nuevoInforme.getInformeFinanciero();
		//return "Informe generado por el comercial";
	}

}
