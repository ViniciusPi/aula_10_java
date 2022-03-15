package projeto_pessoas;

public class Professor extends Pessoa {

    //Atributos
    private String especialidade;
    private double salario;

    //Getters e Setters
    public String getEspecialidade() {
        return especialidade;
    }

    public void setEspecialidade(String especialidade) {
        this.especialidade = especialidade;
    }

    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }


    //Metodos
    public void receberAumento(double aumento) {

        setSalario(getSalario() + aumento);
    }


}
