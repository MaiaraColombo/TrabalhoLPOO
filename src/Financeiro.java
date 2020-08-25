public abstract class Financeiro implements InterfaceCadastro {

	private int id, numero;
	private String emissao, vencimento, pagamento;
	private double valor, juros, multa, desconto, total;

	 @Override
	    public void entrar (){
	    System.out.println ("id: ");
	    setId( input.nextInt());
	    
	    System.out.println ("Numero:  ");
	    setNumero (input.nextInt());

	    System.out.println ("Emissão: ");
	    setEmissao(input.next());
	    
	    System.out.println ("Vencimento: ");
	    setVencimento(input.next());
	    
	    System.out.println ("Pagamento:  ");
	    setPagamento (input.next());

	    System.out.println ("Valor: ");
	    setValor(input.nextDouble());
	    
	    System.out.println ("Juros: ");
	    setJuros(input.nextDouble());
	    
	    System.out.println ("Multa:  ");
	    setMulta (input.nextDouble());

	    System.out.println ("Desconto: ");
	    setDesconto(input.nextDouble());
	    
	    System.out.println("Total: ");
		setTotal(input.nextDouble());
	    }

	@Override
	    public void imprimir(){
	    System.out.println ("Numero: "+getNumero());
	    System.out.println ("Id: "+getId());
	    System.out.println ("Emissao: "+getEmissao());
	    System.out.println ("Vencimento: "+getVencimento());
	    System.out.println ("Pagamento: "+getPagamento());
	    System.out.println ("Valor: "+getValor());
	    System.out.println ("Juros: "+getJuros());
	    System.out.println ("Multa: "+getMulta());
	    System.out.println("Desconto: "+getDesconto());
	    System.out.println ("Total a pagar: "+getTotal());}
	    
	    
	    public void excluir(){
	    setNumero(0);
	    setId(0);
	    setEmissao(null);
	    setVencimento(null);
	    setPagamento(null);
	    setValor(0);
	    setJuros(0);
	    setMulta(0);
	    setTotal(0);
	    }

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public int getNumero() {
		return numero;
	}

	public void setNumero(int numero) {
		this.numero = numero;
	}

	public String getEmissao() {
		return emissao;
	}

	public void setEmissao(String emissao) {
		this.emissao = emissao;
	}

	public String getVencimento() {
		return vencimento;
	}

	public void setVencimento(String vencimento) {
		this.vencimento = vencimento;
	}

	public String getPagamento() {
		return pagamento;
	}

	public void setPagamento(String pagamento) {
		this.pagamento = pagamento;
	}

	public double getValor() {
		return valor;
	}

	public void setValor(double valor) {
		this.valor = valor;
	}

	public double getJuros() {
		return juros;
	}

	public void setJuros(double juros) {
		this.juros = juros;
	}

	public double getMulta() {
		return multa;
	}

	public void setMulta(double multa) {
		this.multa = multa;
	}

	public double getDesconto() {
		return desconto;
	}

	public void setDesconto(double desconto) {
		this.desconto = desconto;
	}

	public double getTotal() {
		return total;
	}

	public void setTotal(double total) {
		this.total = total;
	}
}
