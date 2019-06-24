import interfaces.Operacao;
import learningIbm.Conta;
import services.OperacaoContaFisica;

public class App {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Conta conta = new Conta();

		conta.setAgencia(0211);
		Operacao operacao = new OperacaoContaFisica();
		operacao.depositar();
	}

}
