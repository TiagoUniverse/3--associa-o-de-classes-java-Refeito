import java.util.Scanner;

public class Index { 
    //Objeto global
    static Aluno aluno1 = new Aluno();
    public static void main(String[] args) {
        cadastro();
       
        System.out.println(aluno1.getNome());    
    }

    public static void cadastro(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Bem vindo ao cadastro de aluno!");
        System.out.println("Digite um nome:");
        aluno1.setNome(sc.nextLine());
        sc.close();
    }
}
