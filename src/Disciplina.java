public class Disciplina {

    private int codigo;
    private String nome;
    private int semestre;

    public Disciplina(int codigo, String nome, int semestre) {
        this.codigo = codigo;
        this.nome = nome;
        this.semestre = semestre;
    }

    public int getCodigo() {
        return codigo;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        if(nome != null) {
            this.nome = nome;
        }
    }

    public int getSemestre() {
        return semestre;
    }

    public void setSemestre(int semestre) {
        if (semestre > 0) {
            this.semestre = semestre;
        }
    }

    @Override
    public String toString() {
        return "Disciplina - " +
                "codigo: " + codigo +
                " | nome: " + nome +
                " | semestre: " + semestre;
    }
}