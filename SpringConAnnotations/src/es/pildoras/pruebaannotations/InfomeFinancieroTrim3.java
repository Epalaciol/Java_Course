package es.pildoras.pruebaannotations;

import org.springframework.stereotype.Component;

@Component
public class InfomeFinancieroTrim3 implements CreacionInformeFinanciero {

	@Override
	public String getInformeFinanciero() {
		// TODO Auto-generated method stub
		return "Presentacion de informe favorable del trimestre 3 ";
	}

}
