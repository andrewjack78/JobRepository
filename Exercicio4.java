package exercicioestagio;

public class Exercicio4 {
	public static void main(String[] args) {
		double distancia = 100; // em km
	    double velocidadeCarro = 110; // em km/h
	    double velocidadeCaminhao = 80; // em km/h
	    double tempoCarro = distancia / velocidadeCarro;
	    double tempoCaminhao = distancia / velocidadeCaminhao + (2 * 5.0 / 60.0); // 2 pedágios com 5 min de atraso cada
	    double tempoTotal = tempoCarro + tempoCaminhao;
	    double distanciaCarro = velocidadeCarro * tempoCarro;
	    double distanciaCaminhao = velocidadeCaminhao * tempoCaminhao;
	        
	      if (distanciaCarro < distanciaCaminhao) {
	          System.out.println("O carro está mais próximo de Ribeirão Preto.");
	      } else {
	          System.out.println("O caminhão está mais próximo de Ribeirão Preto.");
	       }
	   }
	}

