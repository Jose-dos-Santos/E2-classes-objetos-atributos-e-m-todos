package br.com.bytebank.banco.modelo;
import br.com.bytebank.banco.modelo.*;
/**
 * Classe representa a moldura de uma conta
 * 
 * @author José Maria
 *
 */
public abstract class Conta {
	protected double saldo;
    private int agencia;
    private int numero;
    private Cliente titular;
    private static int total = 0;
    /**
     * metodo construtor já emplementa na criação da conta adicionar agencia e conta
     * @param agencia
     * @param numero
     */
    public Conta(int agencia, int numero){
        Conta.total++;
        System.out.println("O total de contas é " + Conta.total);
        this.agencia = agencia;
        this.numero = numero;
        this.saldo = 100;
        System.out.println("Estou criando uma conta " + this.numero);
    }

    public abstract void deposita(double valor);
     // Não pode ter corpo  
    
     /**
      * valor preciza ser maior que o saldo
      * @param valor
      * @throws SaldoInsuficenteException
      */
    public void saca(double valor) throws SaldoInsuficenteException {
        if(this.saldo < valor) {
        	// tem um problema
        	throw new SaldoInsuficenteException("saldo:" + this.saldo + ", saldo:" + valor);
        }
            this.saldo -= valor;
       
    }
    

    public void transfere(double valor, Conta destino) throws SaldoInsuficenteException {
        this.saca(valor);
        destino.deposita(valor);
        
        
    }

    public double getSaldo(){
        return this.saldo;
    }

    public int getNumero(){
        return this.numero;
    }

    public void setNumero(int numero){
        if(numero <= 0) {
            System.out.println("Nao pode valor menor igual a 0");
            return;
        }
        this.numero = numero;
    }

    public int getAgencia(){
        return this.agencia;
    }

    public void setAgencia(int agencia){
       if(agencia <= 0) {
           System.out.println("Nao pode valor menor igual a 0");
           return;
       }
       this.agencia = agencia;
    }

    public void setTitular(Cliente titular){
        this.titular = titular;
    }

    public Cliente getTitular(){
        return this.titular;
    }

    public static int getTotal(){
        return Conta.total;
    }
    
    @Override
	public String toString() {
		// TODO Auto-generated method stub
		return "numero: " + this.numero + ", Agencia: " + this.agencia + "Saldo da conta: " + this.saldo  ;
	}

}


