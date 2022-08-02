package Aula08;

import java.text.DecimalFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

public class ContaBancaria {

    // Atributos -> características

    public DecimalFormat df = new DecimalFormat("R$ #, ##0.00");
    public SimpleDateFormat sdfHora = new SimpleDateFormat("HH:mm:ss");

    public int numero;
    public String titular;
    public double saldo;

    private final double SALDO_INICIAL;

    private String movimentacao;

    // Construtor
    public ContaBancaria(){
        SALDO_INICIAL = 1200;
        saldo = 1200;
        movimentacao = new SimpleDateFormat("dd/MM/yyyy").format(new Date());
    }

    // Métodos -> comportamentos
    public void depositar(double valor){
        saldo += valor;
        movimentacao += "\n C - " + df.format(valor) + " | " + sdfHora.format(new Date());
    }

    public void sacar(double valor){
        saldo -= valor;
        movimentacao += "\n D - " + df.format(valor) + " | " + sdfHora.format(new Date());
    }

    public String gerarExtrato(){
        String res = "";
        res += "Conta: " + numero;
        res += "\nTitular: " + titular.toUpperCase();
        res += "\nSaldo Inicial: " + df.format(SALDO_INICIAL);
        res += "\n____________________________________________";
        res += "\nMovimentação: " + movimentacao;
        res += "\n____________________________________________";
        res += String.format("\nSaldo Disponível: " + df.format(saldo));
        return res;
    }
}
