package Aula10;

public class Pessoa {

    private String nome;
    private String telefone;
    private String endereco;

    public Pessoa(){

    }

    public Pessoa(String nome){
        this.nome = nome;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getTelefone() {
        return telefone;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }

    public String getEndereco() {
        return endereco;
    }

    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }

    public void imprimeNome(){
        System.out.println("O nome da pesoa á: " + nome);
    }
}
