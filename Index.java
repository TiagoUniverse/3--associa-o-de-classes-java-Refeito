//OBJETIVO: O programa entra na função de cadastro de um objeto e no fim de sua execução, ele já executa a classe de exibição de resultados.
// Isso pode ser alterado

import java.util.Scanner;

public class Index {
    // Objeto global
    static Aluno aluno1 = new Aluno();
    static Professor prof1 = new Professor();
    static Turma turma1 = new Turma();
    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {

         cadastroAluno();

        cadastroProfessor();
        cadastroTurma();

        sc.close();
    }

    public static void cadastroAluno() {

        System.out.println("\n Bem vindo ao cadastro de aluno!");
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

        Aluno.exibeAluno();

    }

    public static void cadastroProfessor() {

        System.out.println("\n Bem vindo ao cadastro de um professor!");
        System.out.println("1ª Digite o nome:");

        prof1.setNome(sc.nextLine());
        System.out.println("2ª - Informe a sua chapa: ");
        prof1.setChapa(sc.nextLine());
        System.out.println("3ª - Informe o cpf: ");
        prof1.setCpf(sc.nextLine());
        System.out.println("4ª - Informe o número da identidade: ");
        prof1.setIdentidade(sc.nextLine());
        System.out.println("5ª -  Qual o sexo do professor? (masculino || feminino)");
        prof1.setSexo(sc.nextLine());

        Professor.exibeProfessor();
    }

    public static void cadastroTurma(){
        String analise;
        int analiseValida = 0;

        System.out.println("\n Bem vindo ao cadastro de turma");
        System.out.println("1ª Diga o título da disciplina: ");
        turma1.setDisciplina(sc.nextLine());
        System.out.println("2ª- Informe o bloco da turma: ");
        turma1.setBloco(sc.nextLine());
        // Verificação se a resposta do usuário é número
        do {
            System.out.println("3ª- Informe o número da turma: ");
            analise = sc.nextLine();
            //Se não for um número
            if (!analise.matches("[0-9]+")) {
                analiseValida = 0;
                System.out.println("\n Número inválido. Por favor, digite apenas números: ");
            } else {
                // O sistema entra no else quando as informações estão corretas
                analiseValida = 1;
                turma1.setNumeroTurma(analise);
            }
        } while (analiseValida == 0);

        analiseValida = 0;
        // Verificação se a resposta do usuário é número
        do {
            System.out.println("4ª- Informe o número da sala: ");
            analise = sc.nextLine();
            if (!analise.matches("[0-9]+")) {
                analiseValida = 0;
                System.out.println("\n Número inválido. Por favor, digite apenas números: ");
            } else {
                // O sistema entra no else quando as informações estão corretas
                analiseValida = 1;
                turma1.setNumeroSala(analise);
            }
        } while (analiseValida == 0);

        analiseValida = 0;
        // Verificação de resposta SIM OU NAO
        do {
            System.out.println("5ª- Por fim, esta turma já está disponível? (Sim / Nao)");
            analise = sc.next();
            // Se a análiseValida for igual a 1, então o usuário digitou corretamente
            if (analise.equals("Sim") || analise.equals("sim") || analise.equals("Si") || analise.equals("si")
            || analise.equals("Yes") || analise.equals("yes") || analise.equals("True") || analise.equals("true")) {

                analiseValida = 1;
                turma1.setDisponivel(true);
            } else if (analise.equals("Nao") || analise.equals("nao") || analise.equals("Não") || analise.equals("não")
            || analise.equals("No") || analise.equals("no") || analise.equals("False") || analise.equals("false")
            || analise.equals("NÆo")) {
                
                analiseValida = 1;
                turma1.setDisponivel(false);
            } else {
                System.out.println();
                System.out.println("Informação inválida! Por favor, digite novamente: ");
            }
        } while (analiseValida == 0);

        Turma.exibeTurma();

    }





}
