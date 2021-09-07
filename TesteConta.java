package br.com.bytebank.banco.teste;

import br.com.bytebank.banco.especial.ContaModificadores;
import br.com.bytebank.banco.modelo.ContaCorrente;
import br.com.bytebank.banco.modelo.ContaPoupanca;
import br.com.bytebank.banco.modelo.SaldoInsuficenteException;

//br.com.bytebank.banco.teste.TesteConta
public class TesteConta {// NOME SIMPLES
// VERDADEIRO NOME  "teste.TesteConta
	
	//java.lang.String
	public static void main(String[] args) throws SaldoInsuficenteException { // full qualified name FQN

/**
 * classe representa o entendiemnto sobre midifcadores
 * de visualização
 * 
 */
        ContaModificadores cm = new ContaModificadores(0, 0);
        cm.deposita(1500);
        
		ContaCorrente cc = new ContaCorrente(2145, 222);
		cc.deposita(50000);

		ContaPoupanca cp = new ContaPoupanca(2145, 222);
//		try { 
		cc.transfere(1000, cp);

		System.out.println(cc.getSaldo());

		System.out.println(" saldo CC " + cc.getSaldo());
		System.out.println(" saldo Cp " + cp.getSaldo());
        System.out.println("saldo da conta Modificadores(cm):" + cm);
	}

}
