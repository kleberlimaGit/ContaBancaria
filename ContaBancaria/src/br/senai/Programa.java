package br.senai;

public class Programa {

	public static void main(String[] args) {
		
		Conta minhaConta = new Conta();
		
		minhaConta.abrirConta();
		minhaConta.dono = " Joseffe ";
		minhaConta.limite = 1000;
		minhaConta.saldo = 20000;
		minhaConta.numero = 0002;
		minhaConta.depositar(500);
		minhaConta.status();
		
		minhaConta.fecharConta();
		minhaConta.sacar(20500.00);
		minhaConta.fecharConta();
		minhaConta.status();
	}

}
