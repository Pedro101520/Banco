package view;

import helper.Utils;
import model.Cliente;
import model.Conta;

public class Teste {
	public static void main(String args[]) {
		Cliente pedro = new Cliente(
			"Pedro Lima",
			"pedro@gmail.com",
			"123.456.789.01",
			Utils.stringParaData("17/05/1981")
		);
		
		Cliente clara = new Cliente(
				"Maria Clara",
				"clara@gmail.com",
				"234.567.890.12",
				Utils.stringParaData("23/02/1978")
		);
		
//		System.out.println(pedro);
//		System.out.println();
//		System.out.println(clara);
		
		Conta c101 = new Conta(pedro);
		Conta c102 = new Conta(clara);
		
		//Depositando um valor positivo
		c101.depositar(500.00);
		c102.depositar(500.00);
		
		//Depopsitando um valor 0
//		c101.depositar(0.00);
//		c102.depositar(0.00);
		
		//Depositando um valor negativo
//		c101.depositar(-500.00);
//		c102.depositar(-500.00);
		
		//Saque no saldo suficiente
//		c101.sacar(300.00);
		
		//Tentativa de saque 0
//		c101.sacar(0.0);
		
		//Tentativa de saque com valor negativo
//		c101.sacar(-100.0);
		
		//Aqui vai setar um limite para c101
		c101.setLimite(200.00);
		
		//Tentativa de saca de um valor maior
//		c101.sacar(600.0);
		
		c101.transferir(c102, 100.0);
		
		System.out.println(c101);
		System.out.println();
		System.out.println(c102);
	}
}
