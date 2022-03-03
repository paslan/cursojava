package site.cursojava.introducao;

public class A06EstruturasDeRepeticao04 {
    public static void main(String[] args) {
        // Dado o valor de um carro
        // descubra em quantas vezes ele pode ser parcelado
        // Condição: Valor da parcela >= 1000
        double valorCarro = 32700;
        double valorParcela;
        for (int parcela = 0; parcela < valorCarro; parcela++) {
            valorParcela = valorCarro / parcela;
            if (valorParcela >= 1000){
                System.out.println(parcela+ " parcela(s) "+" R$"+valorParcela);
            } else {
                break;
            }
        }
    }
}
