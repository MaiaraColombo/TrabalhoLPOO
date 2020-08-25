public class PessoaFisica extends Pessoa implements InterfaceCadastro {

    private String cpf, rg, emissor;

    @Override
    public void entrar (){
     super.entrar();
     
     System.out.println("    ");
     System.out.println("Informações pessoais");
     System.out.println("    ");
   
    System.out.println ("Digite seu: CPF: ");
    setCpf(input.next());
    
    System.out.println ("Digite seu RG:  ");
    setRg (input.next());

    System.out.println ("Emissor do RG: ");
    setEmissor(input.next());}
    
    @Override
    public void imprimir(){
    
    super.imprimir();

    System.out.println ("CPF: "+getCpf());
    System.out.println ("RG: "+getRg());
    System.out.println ("Emissor do RG: "+getEmissor());
 
    }
    @Override
    public void excluir() {
    super.excluir();
    setCpf(null);
    setRg(null);
    setEmissor(null);
    
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public String getRg() {
        return rg;
    }

    public void setRg(String rg) {
        this.rg = rg;

    }

    public String getEmissor() {
        return emissor;
    }

    public void setEmissor(String emissor) {
        this.emissor = emissor;
    }

}
