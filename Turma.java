public class Turma {
    private String numeroTurma;
    private String numeroSala;
    private String disciplina;
    private String bloco;
    private boolean disponivel;

    public Turma(){

    }

    public String getNumeroTurma(){
        return this.numeroTurma;
    }

    public String getNumeroSala(){
        return this.numeroSala;
    }

    public String getDisciplina(){
        return this.disciplina;
    }

    public String getBloco(){
        return this.bloco;
    }

    public boolean getDisponivel(){
        return this.disponivel;
    }

    public void setNumeroTurma(String numeroTurma){
        this.numeroTurma = numeroTurma;
    }

    public void setNumeroSala(String numeroSala){
        this.numeroSala = numeroSala;
    }

    public void setDisciplina(String disciplina){
        this.disciplina = disciplina;
    }

    public void setBloco(String bloco){
        this.bloco = bloco;
    }

    public void setDisponivel (Boolean disponivel){
        this.disponivel = disponivel;
    }

    public static void teste(){
        System.out.println("Testee");
    }
}
