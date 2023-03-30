package exercicioestagio;
import java.util.Scanner;

public class Exercicio2 {

	

		public static void main(String[] args) {
		    Scanner valorDigitado = new Scanner(System.in);

		    System.out.print("Informe um número: ");
		    int num = valorDigitado.nextInt();
		    int[] fib = {0, 1};

		    while (fib[fib.length - 1] < num) {
		        int[] newFib = new int[fib.length + 1];
		        System.arraycopy(fib, 0, newFib, 0, fib.length);
		        newFib[fib.length] = fib[fib.length - 1] + fib[fib.length - 2];
		        fib = newFib;
		    }

		    boolean found = false;
		    for (int i = 0; i < fib.length; i++) {
		        if (fib[i] == num) {
		      	  found = true;
		      	  break;
		        }
		    }

		    if (found) {
		        System.out.println("O número " + num + " pertence à sequência de Fibonacci.");
		    } else {
		        System.out.println("O número " + num + " não pertence à sequência de Fibonacci.");
		    }
		}
	}
	

