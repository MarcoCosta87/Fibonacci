import java.util.Scanner;

public class Fibonacci {

	public static void main(String[] args) {

		int i = 1, algarismo, soma = 0, algarismo1 = 0;

		Scanner alg = new Scanner(System.in);
		System.out.println(" Digite um algarismo: ");
		algarismo = alg.nextInt();

		while (algarismo >= soma) {
			System.out.println(soma);
			soma = algarismo1 + i;
			algarismo1 = i;
			i = soma;
		}
		if (algarismo1 == algarismo) {
			System.out.println("\n" + algarismo + " "
					+ " O pr�ximo algarismo da sequ�ncia �  " + soma + "!");
		} else {
			System.out.println("\n" + algarismo + " " + "N�o � um n�mero da sequ�ncia de Fibonacci!");
		}

	}

}
