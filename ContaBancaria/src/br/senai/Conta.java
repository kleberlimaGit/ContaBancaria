package br.senai;

public class Conta {

	int numero;
	String dono;
	double saldo;
	double limite;
	boolean ativa;

	public void status() {

		System.out.println("Número da conta: " + this.numero);
		System.out.println("Dono da conta: " + this.dono);
		System.out.println("Saldo da conta: " + this.saldo);
		System.out.println("Limite da conta: " + this.limite);
		System.out.println((this.ativa)? "Conta Ativa " : "Conta Inativa");

	}

	public void abrirConta() {
		this.ativa = true;
	}

	public void fecharConta() {
		if(this.saldo == 0){
			this.ativa = false;
			System.out.println("Conta foi fechada.");
		}else if(this.saldo > 0){
			System.out.println("Saldo positivo, saque o valor = "+this.saldo+" para fechar a conta");
		}else{
			System.out.println("Saldo negativo, deposite o valor = "+this.saldo+" para fechar a conta");
		}
		
	}

	public void depositar(double valor) {
		if(this.ativa) {
		this.saldo += valor;
	}else {
		System.out.println("Não posso depositar em uma conta inativa");
	}
	
	}
	public void consultarSaldo(){
		System.out.println("Seu Saldo é: "+this.saldo);
	}
	
	public void sacar(Double valorSaque){
		if(this.ativa){
			if(this.saldo < valorSaque){
				System.out.println("Valor do saque é maior do que valor em conta.");
			}else{
				this.saldo-=valorSaque;
				consultarSaldo();
				
			}
		}else{
			System.out.println("Você não pode fazer saque de uma conta desativada.");
		}
		
		
	}
}
