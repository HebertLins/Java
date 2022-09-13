package entrada_processamento_saida;

public class ex40 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int n1,n2,n3,c,n4;
		
		n1 = 1;
		System.out.println(n1);
		n2 = 1;
		System.out.println(n2);
		n3 = 1;
		System.out.println(n3);
		c = 1; 
		while (c < 22){
			c = c + 1;
			n4 = n1 + n2 + n3;
			System.out.println(n4);
			n1 = n2;
			n2 = n3;
			n3 = n4;
		}
	}

}
