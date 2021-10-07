package Prova;
import Aluno.Aluno;

public class main {
    public static void main(String[] args){
        int matricula;
        String nome;
        float nota1;
        float nota2;
        float nota3;
        
        Scanner input = new Scanner(System.in);
        
        System.out.println("Informe o nome do aluno: ");
        nome = input.nextLine();
        System.out.println("Informe a nota 1: ");
        nota1 = input.nextFloat();
        System.out.println("Informe a nota 2: ");
        nota2 = input.nextFloat();
        System.out.println("Informe a nota 3: ");
        nota3 = input.nextFloat();
        System.out.println("Notas lançadas com sucesso!");

        Aluno a = new Aluno(nome);
        a.exibirDados();

        Aluno b = new Aluno(nome);
        b.lancarNotas();
        b.exibirDados();
    }
}
