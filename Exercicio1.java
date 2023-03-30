package exercicioestagio;

public class Exercicio1 {
	public static int INDICE = 13;
	public static int SOMA = 0;
	public static int K = 0;
	public static void main(String[] args) {
		
		while (K < INDICE) {
		    K = K + 1;
		    SOMA = SOMA + K;
		}

		System.out.println(SOMA);

	}

}
