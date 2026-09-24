public class Aluno extends Pessoa{

    private String matricula;

    public Aluno(String cpf, String nome, int idade, String matricula) {
        super(cpf, nome, idade);
        this.matricula = matricula;
    }

    public void pagarMensalidade(){
        System.out.println("Pagamento da mensalidade");
    }

    public String getMatricula() {
        return matricula;
    }
}