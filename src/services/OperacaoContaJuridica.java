package services;

import interfaces.Operacao;

public class OperacaoContaJuridica implements Operacao{

	@Override
	public void depositar() {
		// TODO Auto-generated method stub
		
		Boolean cpf = true;
		
		if (cpf) {
			System.out.println("Conta CPF");
			
		}
		
	}

	@Override
	public void depositar(String conta) {
		// TODO Auto-generated method stub
		
	}

}
