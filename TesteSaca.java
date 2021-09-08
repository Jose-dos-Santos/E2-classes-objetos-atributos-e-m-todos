package br.com.bytebank.banco.teste;
import br.com.bytebank.banco.modelo.*;
public class TesteSaca {

	public static void main(String[] args) {
		Conta conta = new ContaCorrente(222, 1111);
		
		conta.deposita(200);
		try {
		conta.saca(1900);
		}catch (SaldoInsuficenteException ex) {
			System.out.println("Ex:" + ex.getMessage());// na classe foi esquecido de mencinar o "super" apontando para classe mão, por isso na mensagem saiu somente null.
		}
		System.out.println(conta.getSaldo());

	}

}
