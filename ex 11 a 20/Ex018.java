import java.util.Scanner;

public class Ex18 {

	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);

		double aceleracao, velocidadeInicial, tempoPercurso, velocidadeFinal;

		System.out.printf("Insira a aceleração: ");
		aceleracao = ler.nextDouble();

		System.out.printf("Insira a velocidade Inicial: ");
		velocidadeInicial = ler.nextDouble();

		System.out.printf("Insira o tempor de percurso: ");
		tempoPercurso = ler.nextDouble();

		velocidadeFinal = (velocidadeInicial + (aceleracao * tempoPercurso)) * 3.6;

		if (velocidadeFinal > 120) {
			System.out.printf("Veículo muito rápido");

		} else if (velocidadeFinal > 80) {
			System.out.printf("Veículo rápido");

		} else if (velocidadeFinal > 60) {
			System.out.printf("Velocidade de cruzeiro");

		} else if (velocidadeFinal > 40) {
			System.out.printf("Velocidade permitida");

		} else {
			System.out.printf("Veículo muito lento");

		}

	}

}
