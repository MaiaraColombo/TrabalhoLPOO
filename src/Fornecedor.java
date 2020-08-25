public class Fornecedor extends PessoaJuridica {

	private double limite_compra;
	private String site, data_cadastro;

	@Override
	public void entrar() {
		super.entrar();
		System.out.print("Site: ");
		setSite(input.next());

		System.out.print("Data de cadastro: ");
		setData_cadastro(input.next());

		System.out.print("Limite de compra: ");
		setLimite_compra(input.nextDouble());

	}

	@Override
	public void imprimir() {

		super.imprimir();
		System.out.println("Site: " + getSite());
		System.out.println("Data de cadastro: " + getData_cadastro());
		System.out.println("Limite de compra: " + getLimite_compra());

	}
	
	public void excluir() {
		setLimite_compra(0);
		setSite(null);
		super.excluir();
		
	}


	public double getLimite_compra() {
		return limite_compra;
	}

	public void setLimite_compra(double limite_compra) {
		this.limite_compra = limite_compra;
	}

	public String getSite() {
		return site;
	}

	public void setSite(String site) {
		this.site = site;
	}

	public String getData_cadastro() {
		return data_cadastro;
	}

	public void setData_cadastro(String data_cadastro) {
		this.data_cadastro = data_cadastro;

	}


}
