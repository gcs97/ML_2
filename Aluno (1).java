package Prova;

public class Aluno {
    private int matricula;
    private String nome;
    private float nota1;
    private float nota2;
    private float nota3;
    private static int auxMatricula = 0;

    public void Aluno(String nome) {
        this.setNome(nome);
        this.setNota1(0);
        this.setNota2(0);
        this.setNota3(0);
        this.setMatricula = this.gerarMatricula();
    }

    // Get / Set
    public int getMatricula() { return this.matricula; }
    public void setMatricula(int valor) { this.matricula = valor; }
    public String getNome() { return this.nome; }
    public void setNome(float String) { this.nome = valor; }
    public float getNota1() { return this.nota1; }
    public void setNota1(float valor) { this.nota1 = valor; }
    public float getNota2() { return this.nota2; }
    public void setNota2(float valor) { this.nota2 = valor; }
    public float getNota3() { return this.nota3; }
    public void setNota3(float valor) { this.nota3 = valor; }
    
    // Demais métodos
    private static int gerarMatricula() {
        auxMatricula = auxMatricula + 1;
    }
    public void exibirDados() {
        System.out.println("Matrícula: " + this.getMatricula());
        System.out.println("Nome do Aluno: " + this.getNome());
        System.out.println("Notas: " + this.getNota1() + ", " + this.getNota2() + ", " + this.getNota3());
        System.out.println("Média: " + this.calcularMedia());
        
        String situacao = "Aprovado";
        this.verificarAprovacao() ?: situacao = "Reprovado";
        
        System.out.println("Situação: " + situacao);
    }

    public void lancarNotas() {
        Scanner input = new Scanner(System.in);
        
        System.out.println("Insira o valor da primeira nota: ");
        valor = input.nextFloat();
        this.setNota1(valor);

        System.out.println("Insira o valor da segunda nota: ");
        valor = input.nextFloat();
        this.setNota2(valor);

        System.out.println("Insira o valor da terceira nota: ");
        valor = input.nextFloat();
        this.setNota3(valor);

        System.out.println("Notas lançadas com sucesso!");
    }

    private float calcularMedia(float n1, float n2, float n3) {
        return (n1+n2+n3)/3;
    }

    private boolean verificarAprovacao(float n) {
        return this.calcularMedia(
            this.getNota1(),
            this.getNota2(),
            this.getNota3(),
        ) >= 7.0;
    }
}
