package br.com.alura.conversor;

import br.com.alura.conversor.moedas.modelos.Conversor;

public class Main {

	public static void main(String[] args) {
		Conversor conv = new Conversor("CONVERSOR_REAIS_LIBRAS_ESTERLINAS", 5);
		double r = conv.convertirMoeda();	
		System.out.printf("Resultado:  %.2f", r );
	}
}
