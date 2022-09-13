package entrada_processamento_saida;

import java.util.Scanner;

public class ex33 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner ler = new Scanner (System.in);
		
		String s;
		
		System.out.print("Digite o seu sexo (M ou F): ");
		s = ler.next();
		
		while (s != "F" || s != "M") {
			System.out.println("Sua opção não se encaixa!");
			System.out.print("Digite o seu sexo (M ou F): ");
			s = ler.next();
		}
		
	
		
	}

}
