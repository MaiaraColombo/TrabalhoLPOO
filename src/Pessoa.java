public abstract class Pessoa implements InterfaceCadastro {
    private String email, id, nome;
    private Endereco endereco;
    private Telefone telefone;
    

    @Override
    public void entrar (){
    endereco = new Endereco();
    telefone = new Telefone();
    
    System.out.println ("Digite o nome: ");
    setNome(input.next());
    
    System.out.println ("Digite o Id:  ");
    setId(input.next());
    
    System.out.println ("Digite o email:  ");
    setEmail(input.next());
   
    this.telefone.entrar();
     
    endereco.entrar();
    
    }
    
    @Override
    public void imprimir(){
    System.out.println ("Email:"+getEmail());
    System.out.println ("Id: "+getId());
    System.out.println ("Nome: "+getNome());
    
    endereco.imprimir();
    this.telefone.imprimir();
    }
   
    
    @Override
    public void excluir(){
    endereco = new Endereco();
    telefone = new Telefone();
    
    telefone.excluir();
    endereco.excluir();
    
    setEmail(null);
    setId(null);
    setNome(null);
    
    }
    
    public String getId (){
      return id;
    }
    public void setId (String id){
      this.id=id;
    }

    public String getNome (){
      return nome;
    }
    public void setNome (String nome){
      this.nome=nome;
    }
    
      
    public String getEmail(){
      return email;
    }
    public void setEmail (String email){
      this.email= email;
    }
    }
  
    
   