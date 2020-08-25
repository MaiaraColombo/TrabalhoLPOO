public class Cliente extends PessoaJuridica {

	private double limite_credito;
	private Endereco endereco_cobranca;

	@Override
	public void entrar() {
		super.entrar();
		System.out.print("Limite de Credito: ");
		setLimite_credito(input.nextDouble());
		
	}

	public void imprimir() {
		super.imprimir();
		System.out.print("Limite de Credito: ");
		setLimite_credito(input.nextDouble());
	}
	
	 @Override
	 public void excluir() {
		 super.excluir();
	     setLimite_credito(0);
	 }

	public double getLimite_credito() {
		return limite_credito;
	}

	public void setLimite_credito(double limite_credito) {
		this.limite_credito = limite_credito;
	}

	public Endereco getEndereco_cobranca() {
		return endereco_cobranca;
	}

	public void setEndereco_cobranca(Endereco endereco_cobranca) {
		this.endereco_cobranca = endereco_cobranca;

	}

	
}
