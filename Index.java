import java.util.Scanner;

public class Index { 
    //Objeto global
    static Aluno aluno1 = new Aluno();
    public static void main(String[] args) {
        cadastroAluno();
       
        //System.out.println(aluno1.getNome()); 
        Aluno.exibeAluno();   
    }

    public static void cadastroAluno(){
        Scanner sc = new Scanner(System.in);
       // String analise;
        //int analiseValida;

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
    }

}
