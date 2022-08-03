package Aula10;

public class Cliente extends Pessoa{

    private String cpf;
    private String rg;

    public Cliente(){

    }

    public Cliente(String cpf){
        this.cpf = cpf;
    }

    public Cliente(String nome, String cpf){
        super(nome);
        this.cpf = cpf;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public String getRg() {
        return rg;
    }

    public void setRg(String rg) {
        this.rg = rg;
    }

    @Override
    public void imprimeNome(){
        System.out.println("O nome do cliente é: " + getNome() + "\nNº CPF: " + getCpf());
    }
}
