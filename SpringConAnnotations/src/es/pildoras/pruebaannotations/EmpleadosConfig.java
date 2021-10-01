package es.pildoras.pruebaannotations;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;

@Configuration
@ComponentScan("es.pildoras.pruebaannotations")
@PropertySource("classpath:datosEmpresa.propiedades")
public class EmpleadosConfig {
	
	
	//Definir el bean para InformeFinancieroDtoCompras
	
	@Bean
	public CreacionInformeFinanciero informeFinancieroDtoCompras() {//id  del bean inyectado
		
		return new InformeFinancieroDtoCompras();
	}
	
	//definir el bean Director Financiero e inyectar dependencias
	
	@Bean
	public Empleados directorFinanciero() {
		
		return new DirectorFinanciero(informeFinancieroDtoCompras());
	}

}
