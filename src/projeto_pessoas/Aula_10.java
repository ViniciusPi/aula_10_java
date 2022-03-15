package projeto_pessoas;

public class Aula_10 {
    public static void main(String[] args) {
        Pessoa pessoa = new Pessoa();
        Aluno aluno = new Aluno();
        Professor professor = new Professor();
        Funcionario funcionario = new Funcionario();

        pessoa.setNome("Anderson");
        aluno.setNome("Sofia");
        professor.setNome("Danilo");
        funcionario.setNome("Clotilde");

        aluno.setCurso("Mecanica");
        professor.setSalario(2550);
        funcionario.setSetor("RH");
        funcionario.setTrabalhando(true);

        pessoa.informacoes();
        aluno.informacoes();
        professor.informacoes();
        funcionario.informacoes();


    }
}
