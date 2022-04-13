public class Professor {
    private String nome;
    private String sexo;
    private String chapa;
    private String cpf;
    private String identidade;

    public Professor(){

    }

    public String getNome(){
        return this.nome;
    }

    public String getSexo(){
        return this.sexo;
    }

    public String getChapa(){
        return this.chapa;
    }

    public String getCpf(){
        return this.cpf;
    }

    public String getIdentidade(){
        return this.identidade;
    }

    public void setNome(String nome){
        this.nome = nome;
    }

    public void setSexo(String sexo){
        this.sexo = sexo;
    }

    public void setChapa (String chapa){
        this.chapa = chapa;
    }

    public void setCpf(String cpf){
        this.cpf = cpf;
    }

    public void setIdentidade(String identidade){
        this.identidade = identidade;
    }

    public static void exibeProfessor(){
        System.out.println("\n Resumo do cadastro do professor");
        System.out.println(" Nome: " + Index.prof1.getNome());
    }
}
