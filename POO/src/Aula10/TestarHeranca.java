package Aula10;

public class TestarHeranca {

    public static void main(String[] args){
        Pessoa pessoa = new Pessoa();
        pessoa.setNome("Nome da pessoa");

        pessoa.imprimeNome();

        Cliente cliente = new Cliente();

        cliente.setNome("Alguém com nome");
        cliente.setCpf("Alguém com cpf");

        cliente.imprimeNome();
    }
}
