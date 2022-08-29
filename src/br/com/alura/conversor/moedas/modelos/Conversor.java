package br.com.alura.conversor.moedas.modelos;

public class Conversor {
	private String opcao;
	private double quantidadeConverter;	
		
	public Conversor(String opcao, double quantidadeConverter){
		this.opcao = opcao;
		this.quantidadeConverter = quantidadeConverter;
	}
	
	public double convertirMoeda() {		
		double resultado = 0;
		
		switch(opcao) {
		  case "CONVERSOR_REAIS_DOLAR":{
			  Moeda moeda = Moeda.CONVERSOR_REAIS_DOLAR;				
			  resultado = quantidadeConverter * moeda.getMoeda();
			  break;
		  	}
		  
		  case "CONVERSOR_DOLAR_REAIS":{
			  Moeda moeda = Moeda.CONVERSOR_DOLAR_REAIS;				
			  resultado = quantidadeConverter * moeda.getMoeda();
			  break;
		  	}
		  
		  case "CONVERSOR_REAIS_EUROS":{
			  Moeda moeda = Moeda.CONVERSOR_REAIS_EUROS;				
			  resultado = quantidadeConverter * moeda.getMoeda();
			  break;
		  	}
		  
		  case "CONVERSOR_EUROS_REAIS":{
			  Moeda moeda = Moeda.CONVERSOR_EUROS_REAIS;				
			  resultado = quantidadeConverter * moeda.getMoeda();
			  break;
		  	}
		  
		  case "CONVERSOR_REAIS_LIBRAS_ESTERLINAS":{
			  Moeda moeda = Moeda.CONVERSOR_REAIS_LIBRAS_ESTERLINAS;				
			  resultado = quantidadeConverter * moeda.getMoeda();
			  break;
		  	}
		  
		  case "CONVERSOR_LIBRAS_ESTERLINAS_REAIS":{
			  Moeda moeda = Moeda.CONVERSOR_LIBRAS_ESTERLINAS_REAIS;				
			  resultado = quantidadeConverter * moeda.getMoeda();
			  break;
		  	}
		  
		  case "CONVERSOR_REAIS_PESO_ARGENTINO":{
			  Moeda moeda = Moeda.CONVERSOR_REAIS_PESO_ARGENTINO;				
			  resultado = quantidadeConverter * moeda.getMoeda();
			  break;
		  	}
		  
		  case "CONVERSOR_PESO_ARGENTINO_REAIS":{
			  Moeda moeda = Moeda.CONVERSOR_PESO_ARGENTINO_REAIS;				
			  resultado = quantidadeConverter * moeda.getMoeda();
			  break;
		  	}
		  
		  case "CONVERSOR_REAIS_PESO_CHILENO":{
			  Moeda moeda = Moeda.CONVERSOR_REAIS_PESO_CHILENO;				
			  resultado = quantidadeConverter * moeda.getMoeda();
			  break;
		  	}
		  
		  case "CONVERSOR_PESO_CHILENO_REAIS":{
			  Moeda moeda = Moeda.CONVERSOR_PESO_CHILENO_REAIS;				
			  resultado = quantidadeConverter * moeda.getMoeda();
			  break;
		  	}

		  default:
		    System.out.println("Ocurreu um erro na seleção, Intente de novo");
		}
		return resultado;
	}		
}