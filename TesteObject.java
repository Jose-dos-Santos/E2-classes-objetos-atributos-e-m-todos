package br.com.bytebank.banco.teste;

import br.com.bytebank.banco.modelo.Cliente;
import br.com.bytebank.banco.modelo.ContaCorrente;
import br.com.bytebank.banco.modelo.ContaPoupanca;

public class TesteObject {

	public static void main(String[] args) {
		
//		System.out.println("k");
//		System.out.println(3);
//		System.out.println(false);
		
		Object cc = new ContaCorrente(4444, 5555);
		Object cp = new ContaPoupanca(333, 444);
		Object Cliente = new Cliente();
		
		System.out.println(cc.toString());// não precisa chamar o metodo toString 
		System.out.println(cp);// não precisa chamar o metodo toString 
		

	}

}
