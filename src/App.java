public class App {
    public static void main(String[] args) throws Exception {
        Aluno aluno = new Aluno(1, "Baltazar", 7);
        Aluno aluno2 = new Aluno(2, "Cézar", 8);
        Aluno aluno3 = new Aluno(3, "Caio", 9);
        Aluno aluno4 = new Aluno(4, "Ribeiro", 4);

       /*  System.out.println(aluno + "\n");
        System.out.println(aluno2 + "\n");
        System.out.println(aluno3 + "\n");
        System.out.println(aluno4 + "\n");*/

        Aluno[] alunos = {aluno, aluno2};
        Aluno[] estudantes = {aluno3, aluno4};

        Turma turma = new Turma("ADS", alunos);
        Turma classe = new Turma("SI", estudantes);

        turma.exibirAlunos();
        classe.exibirAlunos();
        Turma[] turmas = {turma, classe};
        Escola unimes = new Escola("Unimes", turmas);

        unimes.exibirTurmas();
    }
}
