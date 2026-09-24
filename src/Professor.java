public class Professor extends Pessoa{

    private String centro;

    public Professor(String cpf, String nome, int idade, String centro) {
        super(cpf, nome, idade);
        this.centro = centro;
    }

    public void darAula(){
        System.out.println("*PROFESSOR EM AULA");
    }

    public String getCentro() {
        return centro;
    }

    public void setCentro(String centro) {
        if(centro != null) {
            this.centro = centro;
        }
    }

    @Override
    public String toString() {
        return super.toString() + " | centro: " + centro ;
    }
}