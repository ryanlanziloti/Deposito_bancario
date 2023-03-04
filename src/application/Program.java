package application;

import java.util.Scanner;

import entities.Dados;

public class Program {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);	
		Dados dados = new Dados();
		
		int resposta;
		
		System.out.print("Numero: ");
		int number = sc.nextInt();
		dados.setNumber(number);
		
		System.out.print("Nome: ");
		dados.name = sc.next();
		
		System.out.print("Tera um depósito inicial? (s/n): ");
		resposta = sc.nextInt();
		
		if (resposta==1) {
			System.out.print("Insira o valor inicial: ");
			float money = sc.nextFloat();
			dados.setMoney(money);
		}else if(resposta==2) {
		}
		System.out.println();
		System.out.print("Conta "+dados.getNumber()+", Nome: "+dados.name+", Dinheiros: $ "+dados.getMoney());
		
		System.out.println();
		System.out.print("Entre o valor do depósito: ");
		float deposito = sc.nextFloat();
		dados.setMoney(dados.getMoney()+deposito);
		
		System.out.println();
		System.out.print("Conta "+dados.getNumber()+", Nome: "+dados.name+", Dinheiros: $ "+dados.getMoney());
		
		System.out.println();
		System.out.print("Entre o valor que deseja retirar: ");
		float retirada = sc.nextFloat();
		dados.setMoney(dados.getMoney()-retirada-5);
		
		System.out.println();
		System.out.print("Conta "+dados.getNumber()+", Nome: "+dados.name+", Dinheiros: $ "+dados.getMoney());


		sc.close();
			
	}

}
