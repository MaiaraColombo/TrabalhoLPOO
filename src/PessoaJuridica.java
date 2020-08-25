public abstract class PessoaJuridica extends Pessoa {

    private String cnpj, contato, inscricao_estadual;
 
    @Override
    public void entrar (){
    
    super.entrar();
        
    System.out.println ("Cnpj: ");
    setCnpj(input.next());
    
    System.out.println ("Inscrição estadual:  ");
    setInscricao_estadual (input.next());

    System.out.println ("Contato: ");
    setContato(input.next());}
    

    @Override
    public void imprimir(){
        
    super.imprimir();
    System.out.println ("Cnpj: "+getCnpj());
    System.out.println ("Inscrição Estadual: "+getInscricao_estadual());
    System.out.println ("Contato: "+getNome());
    }
    
    
    @Override
   public void excluir(){
   
   super.excluir();
   
   setCnpj(null);
   setInscricao_estadual(null);
   setNome(null);
   } 
 
    public String getCnpj (){
      return cnpj;
    }
    public void setCnpj(String cnpj){
      this.cnpj=cnpj;
    }

    public String getInscricao_estadual (){
      return inscricao_estadual;
    }
    public void setInscricao_estadual (String inscricao_estadual){
      this.inscricao_estadual=inscricao_estadual;
    }
    
    public String getContato(){
      return contato;
    }
    
    public void setContato(String contato){
      this.contato=contato;
    }
    
    
    }
   
    
   