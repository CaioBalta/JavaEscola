public class Escola {
    public String nome;
    public Turma[] turmas;

    public Escola(String nome, Turma[] turmas){
        this.nome = nome;
        this.turmas = turmas;
    }

    public void exibirTurmas(){
        for(Turma turma: turmas){
            System.out.println(turma.nome);
            turma.exibirAlunos();
        }
    }
}