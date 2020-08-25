public class Endereco implements InterfaceCadastro {

	private String logradouro, numero, complemento, bairro, cidade, estado;
	private int cep;

	@Override
	public void entrar() {

		System.out.println("      ");
		System.out.println("Cadastro de endereço ");
		System.out.println("     ");
		
		System.out.println("CEP: ");
		setCep(input.nextInt());
		
		System.out.println("Logradouro: ");
		setLogradouro(input.next());

		System.out.println("Numero da casa: ");
		setNumero(input.next());

		System.out.println("Complemento: ");
		setComplemento(input.next());

		System.out.println("Bairro: ");
		setBairro(input.next());

		System.out.println("Cidade: ");
		setCidade(input.next());

		System.out.println("Estado: ");
		setEstado(input.next());
	}

	@Override
	public void imprimir() {
		System.out.println("CEP: " + getCep());
		System.out.println("Logradouro: " + getLogradouro());
		System.out.println("Numero da casa: " + getNumero());
		System.out.println("Complemento: " + getComplemento());
		System.out.println("Bairro: " + getBairro());
		System.out.println("Cidade: " + getCidade());
		System.out.println("Estado: " + getEstado());
	}

	@Override
	public void excluir() {
		setLogradouro(null);
		setNumero(null);
		setComplemento(null);
		setBairro(null);
		setCidade(null);
		setEstado(null);
	}

	public String getLogradouro() {
		return logradouro;
	}

	public void setLogradouro(String logradouro) {
		this.logradouro = logradouro;
	}

	public String getNumero() {
		return numero;
	}

	public void setNumero(String numero) {
		this.numero = numero;
	}

	public String getComplemento() {
		return complemento;
	}

	public void setComplemento(String complemento) {
		this.complemento = complemento;
	}

	public String getBairro() {
		return bairro;
	}

	public void setBairro(String bairro) {
		this.bairro = bairro;
	}

	public String getCidade() {
		return cidade;
	}

	public void setCidade(String cidade) {
		this.cidade = cidade;
	}

	public String getEstado() {
		return estado;
	}

	public void setEstado(String estado) {
		this.estado = estado;
	}

	public int getCep() {
		return cep;
	}

	public void setCep(int cep) {
		this.cep = cep;
	}
}