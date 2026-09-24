import java.util.ArrayList;

public class Turma {

    private int codigo;
    private Professor professor;
    private Disciplina disciplina;
    private ArrayList<Aluno> alunos = new ArrayList<>();


    public Turma(int codigo, Professor professor, Disciplina disciplina) {
        this.codigo = codigo;
        this.professor = professor;
        this.disciplina = disciplina;
    }

    public int getCodigo() {
        return codigo;
    }

    public Professor getProfessor() {
        return professor;
    }

    public void setProfessor(Professor professor) {
        if(professor != null) {
            this.professor = professor;
        }
    }

    public Disciplina getDisciplina() {
        return disciplina;
    }

    public void setDisciplina(Disciplina disciplina) {
        if(disciplina != null) {
            this.disciplina = disciplina;
        }
    }

    public void adicionarAluno(Aluno aluno){
        if (aluno != null) {
            alunos.add(aluno);
        }
    }

    public void removerAluno(Aluno aluno){
        alunos.remove(aluno);
    }

    public void listarAlunos(){

        System.out.println("Alunos: ");

        for(Aluno aluno: alunos){
            System.out.println(aluno);
            aluno.pagarMensalidade();
            System.out.println();
        }
    }

    @Override
    public String toString() {
        return "Turma - " +
                "código: " + codigo + "\n" +
                disciplina + "\n\n" +
                "Professor - " + professor;
    }
}