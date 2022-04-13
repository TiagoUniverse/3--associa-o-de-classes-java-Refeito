//OBJETIVO: O programa entra na função de cadastro de um objeto e no fim de sua execução, ele já executa a classe de exibição de resultados.
// Isso pode ser alterado
import java.util.Scanner;

public class Index { 
    //Objeto global
    static Aluno aluno1 = new Aluno();
    static Professor prof1 = new Professor();
    public static void main(String[] args) {
        
        //cadastroAluno();
        Professor.teste();
        
    }

    public static void cadastroAluno(){
        Scanner sc = new Scanner(System.in);

        System.out.println("Bem vindo ao cadastro de aluno!");
        System.out.println("1ª- Digite um nome:");
        aluno1.setNome(sc.nextLine());
        System.out.println("2ª- Informe o cpf: ");
        aluno1.setCpf(sc.nextLine());
        System.out.println("3ª- Informe o número da identidade: ");
        aluno1.setIdentidade(sc.nextLine());
        System.out.println("4ª- Informe a matrícula: ");
        aluno1.setMatricula(sc.nextLine());
        System.out.println("5ª- Qual o sexo do aluno? (masculino || feminino) ");
        aluno1.setSexo(sc.nextLine());
        System.out.println("6ª- Por fim, qual é o curso deste aluno? ");
        aluno1.setCurso(sc.nextLine());

        sc.close();
        Aluno.exibeAluno(); 

    }

}
