package br.com.alura.conversor.moedas.modelos;

public enum Moeda {
	
	CONVERSOR_REAIS_DOLAR(0.20),
	CONVERSOR_DOLAR_REAIS(5.06),
	CONVERSOR_REAIS_EUROS(0.19),
	CONVERSOR_EUROS_REAIS(5.25),
	CONVERSOR_REAIS_LIBRAS_ESTERLINAS(0.16),
	CONVERSOR_LIBRAS_ESTERLINAS_REAIS(6.20),
	CONVERSOR_REAIS_PESO_ARGENTINO(26.30),
	CONVERSOR_PESO_ARGENTINO_REAIS(0.04),
	CONVERSOR_REAIS_PESO_CHILENO(174.20),
	CONVERSOR_PESO_CHILENO_REAIS(0.01);
	
	private double valor;

	Moeda(double valor) {
		this.valor = valor;
	}
	
	public double getMoeda() {
		return this.valor;
	}
		
}
