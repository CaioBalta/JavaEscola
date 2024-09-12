public class Aluno {
    public int ra;
    public String nome;
    public double nota;

    public Aluno(int ra, String nome, double nota){
        this.ra = ra;
        this.nome = nome;
        this.nota = nota;
    }

    //Só usar "toString"
    @Override
    public String toString() {
        return "Aluno: \n"+ "\n" + "RA: " + this.ra + "\n" + "Nome: " + this.nome + "\n" + "Nota: " + this.nota;
    }

}
