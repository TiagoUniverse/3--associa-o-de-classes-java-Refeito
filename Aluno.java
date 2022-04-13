public class Aluno{
    private String nome;
    private String sexo;
    private String matricula;
    private String cpf;
    private String identidade;
    private String curso;

    public Aluno(){

    }

    public String getNome(){
        return this.nome;
    }

    public String getSexo(){
        return this.sexo;
    }

    public String getMatricula(){
        return this.matricula;
    }

    public String getCpf(){
        return this.cpf;
    }

    public String getIdentidade(){
        return this.identidade;
    }

    public String getCurso(){
        return this.curso;
    }

    public void setNome(String nome){
        this.nome = nome;
    }

    public void setSexo(String sexo){
        this.sexo = sexo;
    }

    public void setMatricula(String matricula){
        this.matricula = matricula;
    }

    public void setCpf(String cpf){
        this.cpf = cpf;
    }
    public void setIdentidade(String identidade){
        this.identidade = identidade;
    }

    public void setCurso (String curso){
    this.curso = curso;
    }

    public void cadastro(){
        System.out.println("Bem vindo ao cadastro de aluno!");
    }
}