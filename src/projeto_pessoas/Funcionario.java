package projeto_pessoas;

public class Funcionario extends Pessoa {

    //Atributos
    private String setor;
    private boolean trabalhando;


    //Getters e setters
    public String getSetor() {
        return this.setor;
    }

    public void setSetor(String setor) {
        this.setor = setor;
    }

    public boolean getTrabalhando() {
        return this.trabalhando;
    }

    public void setTrabalhando(boolean trabalhando) {
        this.trabalhando = trabalhando;
    }

    //Metodos
    public void mudarTrabalho() {
        setTrabalhando(!trabalhando);
    }


}
