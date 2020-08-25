public class Telefone implements InterfaceCadastro {
	private int ddd;
	private long numero;

	@Override
	public void entrar() {
		
		System.out.println("      ");
		System.out.println("Cadastro de telefone: ");
		System.out.println("      ");
		
		System.out.println("DDD:  ");
		setDdd(input.nextInt());

		System.out.println("Numero do telefone: ");
		setNumero(input.nextLong());

	}

	@Override
	public void imprimir() {
		System.out.println("DDD: " + getDdd());
		System.out.println("Numero do telefone: " + getNumero());
	}

	@Override
	public void excluir() {
		setDdd(0);
		setNumero(0);
	}

	public long getNumero() {
		return numero;
	}

	public void setNumero(long numero) {
		this.numero = numero;
	}

	public int getDdd() {
		return ddd;
	}

	public void setDdd(int ddd) {
		this.ddd = ddd;
	}

}