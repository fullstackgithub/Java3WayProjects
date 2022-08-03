package Aula09;

import java.text.DecimalFormat;

public class Area {

    protected DecimalFormat df = new DecimalFormat("#,##0.00");
    private double largura;
    private double comprimento;

    private int opc;


    public Area(){

    }

    public Area(double largura, double comprimento){
        this.largura = largura;
        this.comprimento = comprimento;
    }

    public double getLargura() {
        return largura;
    }

    public void setLargura(double largura) {
        this.largura = Math.abs(largura);
    }

    public double getComprimento() {
        return comprimento;
    }

    public void setComprimento(double comprimento) {
        this.comprimento = Math.abs(comprimento);
    }

    public int getOpc() {
        return opc;
    }

    public void setOpc(int opc) {
        this.opc = opc;
    }

    public String calcular(){
        String res = "";
        res += "Valor da Largura: " + getLargura();
        res += "\nValor do Comprimento: " + getComprimento();
        res += "\nÁrea: " + df.format(getLargura() * getComprimento()) + " m2";
        return res;
    }
}
