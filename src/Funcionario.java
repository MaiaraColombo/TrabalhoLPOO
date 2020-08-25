public class Funcionario  extends PessoaFisica{

    private String data_admissao, data_demissao, ctps;
    private double salario;

    @Override
    public void entrar (){
    super.entrar();
    
    System.out.print ("Data de admissão: ");
    setData_admissao(input.next());
    
    System.out.print ("Data de demissão: ");
    setData_demissao(input.next());
    
    System.out.print ("CTPS: ");
    setCtps(input.next());
    
    System.out.print ("Digite o salário: ");
    setSalario(input.nextDouble());
    }
    
    @Override
    public void imprimir(){
    super.imprimir();
    System.out.println ("Data de admissão: "+getData_admissao());
    System.out.println ("Data de demissão: "+getData_demissao());
    System.out.println ("CTPS: "+getCtps());
    System.out.println ("Salário: "+getSalario());}
    
    public void excluir(){
    setData_admissao(null);
    setData_demissao(null);
    setCtps (null);
    setSalario (0);
    
    super.excluir();

    }
    
    public String getData_admissao (){
      return data_admissao;
    }
    public void setData_admissao (String data_admissao){
      this.data_admissao=data_admissao;
    }

    public String getData_demissao (){
      return data_demissao;
    }
    public void setData_demissao (String data_demissao){
      this.data_demissao=data_demissao;
    }
    
    public String getCtps(){
      return ctps;
    }
    
    public void setCtps(String ctps){
      this.ctps=ctps;
    }
    
    
    public double getSalario(){
      return salario;
    }
    public void setSalario (double salario){
      this.salario= salario;
    }
    }
    
   