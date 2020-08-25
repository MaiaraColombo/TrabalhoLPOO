public class Pagar extends Financeiro{
	
   private double total;
   private Fornecedor fornecedor;
   private String boleto;

    public void entrar (){ 
    fornecedor = new Fornecedor();  
    super.entrar();
    
    System.out.print ("Boleto: ");
    setBoleto(input.next());
    }
    
    public double calcular(){
        total=getTotal()+getMulta()+getJuros()-getDesconto();
             return total;   
        }

    public void imprimir(){
        fornecedor = new Fornecedor();   
        super.imprimir();
        System.out.println ("Boleto: "+getBoleto());
    }  

    public void excluir(){
    setBoleto(null);
    super.excluir();
    }
    
    
    public String getBoleto(){
      return boleto;
    }
    
    public void setBoleto (String boleto){
      this.boleto= boleto;
    }

   
    
}