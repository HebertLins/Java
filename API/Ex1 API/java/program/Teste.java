package program;

import java.io.IOException;
import java.util.Scanner;

import model.Endereco;
import service.ViaCepService;

public class Teste {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
	        ViaCepService viacepservice = new ViaCepService();
	        
	        Scanner ler = new Scanner(System.in);
	        String cep;
	        
	        
	        try {
	        	System.out.print("Digite seu CEP: ");
	        	cep = ler.next();
	            Endereco endereco = viacepservice.getEndereco(cep);
	           
	            String Logradouro = endereco.getLogradouro();
	            String Bairro = endereco.getBairro();
	            String Cidade = endereco.getLocalidade();
	           
	            System.out.println("Logradouro: "+ Logradouro + "\n");
	            System.out.println("Bairro: " + Bairro + "\n");
	            System.out.println("Cidade: " + Cidade + "\n");
	           
	        } catch (IOException e) {
	            // TODO Auto-generated catch block
	            e.printStackTrace();
	        }  
	    }

		
	}


