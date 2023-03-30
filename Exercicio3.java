package exercicioestagio;

public class Exercicio3 {
	//para esse exercicio vamos achar a logica de cada um para poder fazer o codigo de cada opção
		
	public static void main(String []args) {
		    //exercicio A)
		    int a = 1;
		    for (int i = 0; i < 4; i++) {
	           a += 2;
	       }
	        System.out.println("Próximo número da sequência a): " + a); 
	        // Exercicio b)
	        int b = 64;
	        for (int i = 0; i < 1; i++) {
	            b *= 2;
	        }
	        System.out.println("Próximo número da sequência b): " + b);

	        // Exercicio c)
	        int c = 6;
	        for (int i = 2; i < 7; i++) {
	            c = i * i;
	        }
	        System.out.println("Próximo número da sequência c): " + c);

	        // Exercicio d)
	        int d = 64;
	        for (int i = 0; i < 1; i++) {
	            d += 2 * (i + 2) * (i + 2);
	        }
	        System.out.println("Próximo número da sequência d): " + d);

	        // Exercicio e)
	        int e1 = 8;
	        int e2 = 5;
	        int e = 0;
	        for (int i = 0; i < 1; i++) {
	            e = e1 + e2;
	        }
	        System.out.println("Próximo número da sequência e): " + e);

	        // Exercicio f)
	        int f = 19;
	        for (int i = 0; i < 1; i++) {
	            f += i == 4 ? 2 : 1;
	        }
	        System.out.println("Próximo número da sequência f): " + f);
	}
}
