package site.cursojava.introducao;

public class A05EstruturasCondicionais04 {
    public static void main(String[] args) {
        double salarioAnual = 70000;
        double primeirafaixa = 9.70 / 100;
        double segundafaixa = 37.35 / 100;
        double terceirafaixa = 49.50 / 100;
        double valorImposto;
        if (salarioAnual <= 34712) {
            valorImposto = salarioAnual * primeirafaixa;
        } else if (salarioAnual >= 34713 && salarioAnual <= 68507) {
            valorImposto = salarioAnual * segundafaixa;
        } else {
            valorImposto = salarioAnual * terceirafaixa;
        }
        System.out.println(valorImposto);
    }
}
