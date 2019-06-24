package services;

import interfaces.Operacao;

public class OperacaoContaFisica implements Operacao{

	@Override
	public void depositar() {
		// TODO Auto-generated method stub
		
		Boolean cnpj = true;
		
		if (cnpj) {
			System.out.println("Conta CNPJ");
			
		}
		
	}

	@Override
	public void depositar(String conta) {
		// TODO Auto-generated method stub
		
	}

}
