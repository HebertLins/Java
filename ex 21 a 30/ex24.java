package entrada_processamento_saida;

import java.util.Scanner;

public class ex24 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner ler = new Scanner(System.in);
		
		String s, ec, n;
		Double tc;
		
		System.out.printf("Digite o seu sexo(M ou F): ");
		s = ler.next();
		System.out.printf("Digite o seu nome: ");
		n = ler.next();
		System.out.printf("Digite o seu estado civil: ");
		ec = ler.next();
		
		if (toUpperCase(s) == "F" && toUpperCase(ec) == "CASADA") {
			System.out.printf("Por quantos anos você é casada?: ");
			tc = ler.nextDouble();
			System.out.printf("Você é uma MULHER CASADA por %f anos");
		}else {
			System.out.printf("Você não se encaixa no perfil");
		}
		
		
	}

	private static String toUpperCase(String ec) {
		// TODO Auto-generated method stub
		return null;
	}

}
