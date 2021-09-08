package br.com.bytebank.banco.teste;

import br.com.bytebank.banco.especial.ContaModificadores;
import br.com.bytebank.banco.modelo.Cliente;
import br.com.bytebank.banco.modelo.Conta;
import br.com.bytebank.banco.modelo.ContaCorrente;
import br.com.bytebank.banco.modelo.ContaPoupanca;
import br.com.bytebank.banco.modelo.SaldoInsuficenteException;

public class TesteConta {

	
	//java.lang.String
	public static void main(String[] args) throws SaldoInsuficenteException { 

/**
 * classe representa o entendiemnto sobre midifcadores
 * de visualização
 * 
 */
        Cliente cliente = new Cliente();
        cliente.setNome("José Maria");
		
        Conta cp = new ContaPoupanca(2145, 222);
		cp.deposita(1000);

		
       System.out.println( cliente.getNome()+" seu saldo é de: "+ cp.getSaldo());
       
	}

}
