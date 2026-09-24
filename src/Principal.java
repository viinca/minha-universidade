public class Principal {
    public static void main(String[] args){

        Disciplina disciplina1 = new Disciplina(501, "Matemática para Programação", 2);
        Disciplina disciplina2 = new Disciplina(232, "Programação Orientada a Objetos", 1);
        Disciplina disciplina3 = new Disciplina(455, "Raciocínio Lógico e Algorítmico", 1);

        Professor professor1 = new Professor("000.000.000-00", "Paulo Ricardo", 26, "Exatas");

        Visitante visitante1 = new Visitante("111.111.111-11", "Saulo Guimarães", 58);
        Visitante visitante2 = new Visitante("222.222.222-22", "Fabiana Rocha", 35);

        Aluno aluno1 = new Bolsista("333.333.333-33", "Pedro Henrique", 19, "29501");
        Aluno aluno2 = new Bolsista("444.444.444-44", "Anna Clara", 24, "29502");
        Aluno aluno3 = new Regular("555.555.555-55", "Clara Vitória", 23, "38591");

        Aluno aluno4 = new Bolsista("666.666.666-66", "João Pedro", 23, "85901");
        Aluno aluno5 = new Bolsista("777.777.777-77", "Luis Felipe", 10, "94566");
        Aluno aluno6 = new Regular("888.888.888-88", "Paulo Henrique", 18, "75064");

        Aluno aluno7 = new Bolsista("999.999.999-99", "Pedro Henrique", 22, "85902");
        Aluno aluno8 = new Bolsista("000.000.000.01", "José Gabriel", 20, "64851");
        Aluno aluno9 = new Regular("000.000.000-02", "Moisés Jerônimo", 29, "44665");

        Turma turma1 = new Turma(101, professor1, disciplina1);
        Turma turma2 = new Turma(102, professor1, disciplina2);
        Turma turma3 = new Turma(103, professor1, disciplina3);

        turma1.adicionarAluno(aluno1);
        turma1.adicionarAluno(aluno2);
        turma1.adicionarAluno(aluno3);

        turma2.adicionarAluno(aluno4);
        turma2.adicionarAluno(aluno5);
        turma2.adicionarAluno(aluno6);

        turma3.adicionarAluno(aluno7);
        turma3.adicionarAluno(aluno8);
        turma3.adicionarAluno(aluno9);

        turma2.removerAluno(aluno5);
        turma3.removerAluno(aluno7);

        aluno1.fazerAniversario();
        professor1.fazerAniversario();

        System.out.println("\nPROPOSTA DE ATIVIDADE PARCIAL - PROGRAMAÇÃO ORIENTADA A OBJETOS\n");

        System.out.println(turma1 + "\n");
        turma1.listarAlunos();
        System.out.println();

        System.out.println(turma2);
        professor1.darAula();
        System.out.println();
        turma2.listarAlunos();
        System.out.println();

        System.out.println(turma3 + "\n");
        turma3.listarAlunos();

        System.out.println("\nVisitantes:");;

        System.out.println("Visitante - " + visitante1);
        System.out.println("Visitante - " + visitante2);
    }
}