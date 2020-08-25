public class Receber extends Financeiro{
	
	private double total;
	private Cliente cliente;
    private String nota_fiscal;

    @Override
    public void entrar (){
        cliente= new Cliente();
        super.entrar();
        
        cliente.entrar();
        
        System.out.print ("Nota fiscal: ");
		setNota_fiscal(input.next());
        
    }
    
    public double calcular(){
        total=getTotal()+getMulta()+getJuros()-getDesconto();
              return total;  
        }
    
    @Override
    public void imprimir(){
        cliente= new Cliente();
        super.imprimir();
        
        cliente.imprimir();

        System.out.println ("Site: "+getNota_fiscal());

        }
    
    public void excluir(){
    super.excluir();
    cliente= new Cliente();
    cliente.excluir();
    
    setNota_fiscal(null);
    }
    
    public double getTotal() {
		return total;
	}

	public void setTotal(double total) {
		this.total = total;
	}


    public Cliente getCliente() {
        return cliente;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }

    public String getNota_fiscal() {
        return nota_fiscal;
    }

    public void setNota_fiscal(String nota_fiscal) {
        this.nota_fiscal = nota_fiscal;
    }


}
