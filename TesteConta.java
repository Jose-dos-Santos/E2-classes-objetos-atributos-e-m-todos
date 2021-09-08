package br.com.bytebank.banco.teste;


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
        Cliente cliente1 = new Cliente();
        cliente1.setNome("José Maria");
        cliente1.setCpf("12345678912");
        
        Cliente cliente2 = new Cliente();
        cliente2.setNome("Pedro");
        Conta contaCorrenete2 = new ContaCorrente(55, 3636);
        contaCorrenete2.setTitular(cliente2);
		
        Conta contaCorrente1 = new ContaCorrente(21, 222);
        contaCorrente1.deposita(2000);
        contaCorrente1.transfere(500, contaCorrenete2);
        
        Conta cp = new ContaPoupanca(2145, 222);
		cp.deposita(1000);

		
       System.out.println( cliente1.getNome()+" seu saldo é de: "+ cp.getSaldo());
       System.out.println( cliente2.getNome() + " seu saldo é de: " + contaCorrenete2.getSaldo());
	}

}
