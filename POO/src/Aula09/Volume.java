package Aula09;

import java.text.DecimalFormat;

public class Volume extends Area{

    private double altura;

    public Volume(){

    }

    public Volume(double largura, double comprimento, double altura){
        super(largura, comprimento);
        this.altura = altura;
    }

    public double getAltura() {
        return altura;
    }

    public void setAltura(double altura) {
        this.altura = altura;
    }

    public String calcular(){
        String res = "";
        res += "Valor da Largura: " + getLargura();
        res += "\nValor do Comprimento: " + getComprimento();
        res += "\nValor da Altura: " + getAltura();
        res += "\nVolume: " + df.format((getLargura() * getComprimento() * getAltura()));
        return res;
    }
}

