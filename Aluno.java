
public class Aluno{
    private String nome;
    private String sexo;
    private String matricula;
    private String cpf;
    private String identidade;
    private String curso;
  

    public Aluno(){

    }

    public  String getNome(){
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

    public static void exibeAluno(){
        System.out.println(" \n Resumo de cadastro");
        System.out.println( " °Nome: " + Index.aluno1.getNome() + "\n °Sexo: " + Index.aluno1.getSexo() + "\n °Nª da matrícula: " + Index.aluno1.getMatricula() + "\n °CPF: " + Index.aluno1.getCpf()  + "\n °Nª da identidade:" + Index.aluno1.getIdentidade() + "\n °Curso: " + Index.aluno1.getCurso() );
    }
}
